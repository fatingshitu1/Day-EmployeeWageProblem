package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int HOURS_PER_DAY = 8;
    static final int PART_TIMES_MONTH= 20;
    static final int DAYS_PER_MONTH =20;
    static final int HOURS_PER_MONTH =100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem");
        //UC1 - Attendance Check
        int employeecheck = (int) (Math.random() * 10) % 3;
        System.out.println("employee check");
        int dailyWage = 0;
        int monthlyWage = 0;
        switch (employeecheck){
            case 1:
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * HOURS_PER_DAY;
            monthlyWage = dailyWage * DAYS_PER_MONTH;
            break;
            case 2:
            System.out.println("Employee is working half day");
            dailyWage = WAGE_PER_HOUR * (HOURS_PER_DAY / 2);
            monthlyWage = dailyWage * DAYS_PER_MONTH;
            break;
            default:
            System.out.println("Employee is absent");
        }
        System.out.println("employee get the daily wage is " + dailyWage);
        System.out.println("employee get the daily wage is " + monthlyWage);
    }
}
