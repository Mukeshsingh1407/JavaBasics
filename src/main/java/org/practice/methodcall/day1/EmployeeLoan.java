package org.practice.methodcall.day1;

public class EmployeeLoan {
    public static void main(String[] args) {
        String[] employeeName = {"john", "jacky", "jerry"};
        int[] employeeSalary = {100, 200, 100};
        loanApply(employeeName, employeeSalary);
    }

    public static void loanApply(String[] employeeName, int[] employeeSalary) {


        for (int i = 0; i < employeeName.length; i++) {
            double loanAmount = employeeSalary[i] * 0.5;
            System.out.println(employeeName[i] + " can apply for a loan of: " + loanAmount);
        }
    }
}