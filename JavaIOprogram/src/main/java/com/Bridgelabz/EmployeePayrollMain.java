package com.Bridgelabz;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollMain {



    private ArrayList<EmployeePayRoll> employeePayrollList;

    public EmployeePayrollMain(){
        employeePayrollList = new ArrayList<>();
    }

    public static void main(String[] args) {
        

        EmployeeFileIOService fileIO = new EmployeeFileIOService();
        List<EmployeePayRoll> list = new ArrayList<>();
        list.add(new EmployeePayRoll(1,"divakar",40000));
        list.add(new EmployeePayRoll(2,"Kumar",60000));
        list.add(new EmployeePayRoll(3,"yadav",50000));
        fileIO.writeDataToFile(list);
        fileIO.printData();
    }

    public void readEmployeePayrollData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id :");
        int id = sc.nextInt();
        System.out.println("Enter employee name : ");
        String name = sc.next();
        System.out.println("Enter employee salary : ");
        double salary = sc.nextDouble();
        employeePayrollList.add(new EmployeePayRoll(id, name, salary));
    }
    public void writeEmployeePayrollData(){
        System.out.println("writing employee payroll data on console :");
        System.out.println(employeePayrollList);
    }
}