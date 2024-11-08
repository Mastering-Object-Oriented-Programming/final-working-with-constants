package com.trainingmug.java;

public class FinalTest {
    public static void main(String[] args) {
        //
        System.out.println("Company Name : " + Employee.COMPANY_NAME);
        System.out.println("Employee Count : " + Employee.employeeCount);
        Employee employee1 = new Employee();
        System.out.println("Company Name : " + employee1.COMPANY_NAME); // Not Recommended
        // employee1.COMPANY_NAME = "TrainingMug Pvt Ltd";

        Employee employee2 = new Employee();
        System.out.println("Company Name : " + employee2.COMPANY_NAME); // Not Recommended

        System.out.println("Company Name : " + Employee.COMPANY_NAME);
        System.out.println("Employee Count : " + Employee.employeeCount);
        employee1.employeeCount = 0;
        System.out.println("Employee Count : " + Employee.employeeCount);
    }

}