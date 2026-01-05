package com.atguigu06.project.team.junit;

import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.service.NameListService;
import com.atguigu06.project.team.service.TeamException;
import org.junit.Test;

import java.nio.file.FileSystemLoopException;

/**
 * ClassName: NameListServiceTest
 * Package: com.atguigu06.project.team.junit
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/1/5 12:09
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService test = new NameListService();
        Employee[] employees = test.getAllEmployees();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    
    @Test
    public void testGetEmployee() {
        NameListService test = new NameListService();
        Employee[] employees = test.getAllEmployees();

        try {
//            int id = 2;
            int id = 20;
            System.out.println(test.getEmployee(id));
        }
        catch (TeamException e) {
            e.printStackTrace();
        }
    }
}
