/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import java.util.*;
import javax.naming.ldap.LdapName;

/**
 *
 * @author sjcet
 */
public class Product 
{
    int pcode,price;
    String pname;

    Product(int a,int b,String c) 
    {
       pcode=a;
       price=b;
       pname=c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n,p;
        String s;
        System.out.println("enter product code:");
        Scanner sc=new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter product price:");
        p=sc.nextInt();
        System.out.println("enter product name:");
        s=str.nextLine();
       
        Product p1=new Product(n,p,s);
        
        int a,b;
        String c;
        System.out.println("enter product code:");
        a=sc.nextInt();
        System.out.println("enter product price:");
        b=sc.nextInt();
        System.out.println("enter product name:");
        c=str.nextLine();
        
        Product p2=new Product(a,b,c);
        
        int d,e;
        String f;
        System.out.println("enter product code:");
        d=sc.nextInt();
        System.out.println("enter product price:");
        e=sc.nextInt();
        System.out.println("enter product name:");
        f=str.nextLine();
        
        Product p3=new Product(d,e,f);
        
        System.out.println("product having lowest price is:\n");
        
        if(p1.price>p2.price && p1.price>p3.price)
            System.out.println(p1.pname);
        else if(p2.price>p3.price && p2.price>p1.price)
            System.out.println(p2.pname);
        else
            System.out.println(p3.pname);
        
        // TODO code application logic here
    }
    
}
