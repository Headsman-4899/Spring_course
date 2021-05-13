package com.daulet.spring.rest;

import com.daulet.spring.rest.configuration.MyConfig;
import com.daulet.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee emp = communication.getEmployee(2);
//        System.out.println(emp);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(9);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(9);
    }
}
