package com.atguigu06.project.team.service;

/**
 * ClassName: TeamException
 * Package: com.atguigu06.project.team.service
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:30
 * @Version 1.0
 */
public class TeamException extends RuntimeException {
    static final long serialVersionUID = -70348971907457669L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
