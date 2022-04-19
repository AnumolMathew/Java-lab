/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class productt 
{
    int pcode,price;
    String pname;

    productt(int a,int b,String c) 
    {
       pcode=a;
       price=b;
       pname=c;
    }
    public static void main(String[] args) 
    {
        int n,p;
        String s;
        System.out.println("enter product code,product price and product name:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextInt();
        s=sc.nextLine();
        
        productt p1=new productt(n,p,s);
        
        int a,b;
        String c;
        System.out.println("enter product code,product price and product name:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextLine();
        
        productt p2=new productt(a,b,c);
        
        int d,e;
        String f;
        System.out.println("enter product code,product price and product name:");
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextLine();
        
        productt p3=new productt(d,e,f);
        
        if(p1.price>p2.price && p1.price>p3.price)
            System.out.println(+p1.price);
        else if(p2.price>p3.price && p2.price>p1.price)
            System.out.println(+p2.price);
        else
            System.out.println(+p3.price);
        
        // TODO code application logic here
    }
}
    