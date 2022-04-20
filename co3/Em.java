
package em;
import java.util.Scanner;

class Emp
{
    int eid,salary;
    String ename,eaddr;

    Emp(int i,int s,String n,String a)
    {
        eid=i;
        salary=s;
        ename=n;
        eaddr=a;
    }
}
class teacher extends Emp
{
    String dept,sub;
    
    teacher(String dp,String d,int id,int s,String n,String a)
    {
        super(id,s,n,a);
        dept=dp;
        sub=d;
    }
    void display()
    {
        System.out.println("\n Empid : "+eid);
        System.out.println(" name : " +ename );
        System.out.println(" salary : " +salary);
        System.out.println(" Address: " +eaddr);
        System.out.println(" department: " +dept);
        System.out.println(" subject: " +sub);
    }
}
    
public class Em 
{
    public static void main(String[] args) 
    {
        int n,id,salary;
        String name,address,dep,sub;
        Scanner sc=new Scanner(System.in);
        
        teacher t[]=new teacher[10];
        
        System.out.println("Enter number of teachers:");
        n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
        System.out.println("\nenter details of teacher"+i);
        
        System.out.println("\n Enter the employee id");
            id=sc.nextInt();
            System.out.println("Enter the name");
            name=sc.next();
            System.out.println("Enter salary");
            salary=sc.nextInt();
            System.out.println("Enter Address");
            address=sc.next();
            System.out.println("Enter department");
            dep=sc.next();
            System.out.println("Enter subject");
            sub=sc.next();
            
        t[i]=new teacher(dep,sub,id,salary,name,address);
        }
        System.out.println("details of teachers are:");
        for(int i=0;i<n;i++)
                {
                   t[i].display();
                }
    }
    
}
