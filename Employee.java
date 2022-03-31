/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import com.sun.xml.internal.ws.client.dispatch.SOAPMessageDispatch;

/**
 *
 * @author sjcet
 */
public class Employee 
{
    int empid,salary;
    String ename;

    public Employee(int a,String b,int c)
    {
        empid=a;
        ename=b;
        salary=c;
    }
    public void total()
    {
        int tot=salary+((salary*20)/100);
        System.out.println("total salary is"+tot);
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Employee e1 = new Employee(101,"Smith",4000);
        e1.total();
        // TODO code application logic here
    }
    
}
