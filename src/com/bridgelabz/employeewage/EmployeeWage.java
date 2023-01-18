package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem");
        //UC1 - Attendance Check
        int x = (int) (Math.random() * 10 )% 2;
        if (x == 0) {
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is Present");
        }
    }
}
