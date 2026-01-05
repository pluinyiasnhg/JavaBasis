package com.atguigu06.project.team.service;

import com.atguigu06.project.team.domain.*;

import static com.atguigu06.project.team.service.Data.*;
import static com.atguigu06.project.team.domain.Equipment.*;

/**
 * ClassName: NameListService
 * Package: com.atguigu06.project.team.service
 * Description:
 * 1. 按照设计要求编写NameListService类
 * 功能：负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * @Author pluinyiasnhg
 * @Create 2026/1/5 09:30
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        // 根据Data.EMPLOYEE，创建一个相同大小的数组employee
        employees = new Employee[EMPLOYEE];

        // 根据DATA.EMPLOYEE中的数据记录，初始化employee数组
        for (int i = 0; i < employees.length; i++) {
            // 通用属性：employeeType, id, name, age, salary
            int employeeType = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            // 额外属性：Designer中bonus；Architect中bonus, stock；equipment
            double bonus;
            int stock;
            Equipment equipment;

            switch (employeeType) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age ,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    private Equipment createEquipment(int i) {
        // 根据Data.EQUIPMENTS，获取其中的数组元素
        int deviceId = Integer.parseInt(EQUIPMENTS[i][0]);
        String modelOrName = EQUIPMENTS[i][1];
        String displayOrPriceOrType = EQUIPMENTS[i][2];

        switch (deviceId) {
            case PC:
                return new PC(modelOrName, displayOrPriceOrType);
            case NOTEBOOK:
                double price = Double.parseDouble(displayOrPriceOrType);
                return new NoteBook(modelOrName, price);
            case PRINTER:
                return new Printer(modelOrName, displayOrPriceOrType);
        }
        return null;
    }

    /**
     * 获取当前所有员工
     * @return 包含所有员工对象的数组
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 获取指定ID的员工对象
     * @param id 指定员工的ID
     * @return 指定员工对象
     * @throws TeamException 找不到指定的员工
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id)
                return employees[i];
        }

        throw new TeamException("找不到指定的员工");
    }

}
