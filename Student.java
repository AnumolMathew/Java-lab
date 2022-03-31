/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student 
{
 int x,n,o;
 Student(int a,int b, int c)
 {
     int m=a;
     int n=b;
     int o=c;
 }
 public void calculate()
 {
     System.out.println("values"+x+n+o);
     int sum=x+n+o;
     System.out.println("sum is:"+sum);
 }
 public void percentage()
 {
     float p=(x+n+o/300)*100;
     System.out.println("percentage is:"+p);
 }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Student s1= new Student(78,78,99);
        Student s2= new Student(78,76,89);
        s1.calculate();
        s1.percentage();
        s2.calculate();
        s2.percentage();
        // TODO code application logic here
    }
}
    
