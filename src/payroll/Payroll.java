/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll
{

    public double Salary;
    public double bonus;
    public String emp;

    /**constructor that takes the salary and employee name
     *
     */
    public Payroll(double Sal,String givenUser)
    {
        Salary=Sal;
        emp=givenUser;

    }
    public void newSalary(double salary){
        if (salary<=3000){
            double bonus=salary/10;
            salary=salary+bonus;
                    
        
            System.out.println("new Salary including bonus is " + salary+" and bonus is 10%");
        }
        else {
            System.out.println("You income is more than 3000 therefore your salary including bonus is " +salary);
        }
}





}

