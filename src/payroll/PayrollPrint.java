/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint
{
    public static void main(String[] args)
    {
        /* here assumed that 5 employee accounts can be created for the given bank */
        Payroll jovan=new Payroll(12.12,"jovan");
        //add code to take input from user, If salary is less than or equal to 3000,calculate a new salary with bonus 10% of salary
        //and store in array then print 5 employee details
        double salary;
        String employee;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the employee name:");
        employee=sc.nextLine();
        System.out.println("Please enter the salary in decimal notation:");
        salary=sc.nextDouble();
        System.out.println("Hi " + employee + ", Your salary is displayed below");
        jovan.newSalary(salary);

    }

}