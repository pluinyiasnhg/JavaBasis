package com.atguigu06.project.team.service;

import com.atguigu06.project.team.domain.Architect;
import com.atguigu06.project.team.domain.Designer;
import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.domain.Programmer;

/**
 * ClassName: TeamService
 * Package: com.atguigu06.project.team.service
 * Description:
 * 功能：关于开发团队成员的管理：添加、删除等。
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:30
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1; // memberId，新增成员自动生成的唯一团队ID
    private final int MAX_MEMBER = 5;  // 团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER]; // 保存当前团队中的各成员对象
    private int total = 0;  // 记录团队中实际的成员数

    public TeamService() {
    }

    /**
     * team不一定会被填满，所以需要新建一个团队对象，反映真实人数
     * @return 返回实际团队中的成员对象
     */
    public Programmer[] getTeam() {
        Programmer[] realTeam = new Programmer[total];
        for (int i = 0; i < realTeam.length; i++) {
            realTeam[i] = team[i];
        }

        return realTeam;
    }

    /**
     * 向团队中添加成员
     * @param e 待添加成员的对象
     * @throws TeamException 添加失败，TeamException中包含了失败原因
     */
    public void addMember(Employee e) throws TeamException {
        if (total == MAX_MEMBER)
            throw new TeamException("成员已满，无法添加");

        if (!(e instanceof Programmer))
            throw new TeamException("该成员不是开发人员，无法添加");

        Programmer p = (Programmer) e;

        if (p.getStatus() == Status.BUSY)
            throw new TeamException("该员工已是某团队成员");

        if (p.getStatus() == Status.VOCATION)
            throw new TeamException("该员工正在休假，无法添加");

        if (isExist(p))
            throw new TeamException("该员工已在本开发团队中");

        // 统一处理以下异常：
        // 团队中至多只能有一名架构师
        // 团队中至多只能有两名设计师
        // 团队中至多只能有三名程序员
        int architectNum = 0;
        int designerNum = 0;
        int programmerNum = 0;
        for (int i = 0; i < getTeam().length; i++) {
            if (team[i] instanceof Architect) {
                architectNum++;
            }
            else if (team[i] instanceof Designer) {
                designerNum++;
            }
            else {
                programmerNum++;
            }
        }

        if (p instanceof Architect) {
            if (architectNum >= 1)
                throw new TeamException("团队中至多只能有一名架构师");
        }
        else if (p instanceof Designer) {
            if (designerNum >= 2)
                throw new TeamException("团队中至多只能有两名设计师");
        } else {
            if (programmerNum >= 3)
                throw new TeamException("团队中至多只能有三名程序员");
        }

        //代码如果能执行到此位置，意味着p是可以添加到team数组中的
        // 分配组内ID，以及设置该成员的状态为已组队
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    /**
     * 通过唯一的ID，判断员工P是否已经在待添加的团队中
     * @param p 员工
     * @return 如果是当前团队一员，返回true
     */
    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId())
                return true;
        }

        return false;
    }

    /**
     * 从团队中删除成员
     * @param memberId 待删除成员的memberId
     * @throws TeamException 找不到指定memberId的员工，删除失败
     */
    public void removeMember(int memberId) throws TeamException {
        for (int i = 0; i < total; i++) {
            if (memberId == team[i].getMemberId()) {
                team[i].setStatus(Status.FREE);

                for (int j = i; j < total - 1; j++)
                    team[j] = team[j + 1];

                team[--total] = null;

                return;
            }
        }
        // 代码执行到此，说明没找到该员工
        throw new TeamException("找不到memberId为" + memberId + "的员工，删除失败");
    }
}
