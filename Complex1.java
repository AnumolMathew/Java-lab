/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex1;

/**
 *
 * @author sjcet
 */
package complex1;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Complex1{
    int real,img;
    
    Complex1(){
        
    }

    Complex1(int realn,int imgn){
        real=realn;
        img=imgn;
        
        
    }
    
    public Complex1 add(Complex1 c1,Complex1 c2){
        Complex1 c=new Complex1();
        c.real=c1.real+c2.real;
        c.img=c1.img+c2.img;
        return c;
    }
    
    public static void main(String[] args) {
        int real1,img1,real2,img2;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter first number real part");
        real1=sc.nextInt();
        System.out.println("Enter the first number imaginary part");
        img1=sc.nextInt();
        System.out.println("Enter second number real part");
        real2=sc.nextInt();
        System.out.println("Enter the second number imaginary part");
        img2=sc.nextInt();
        
        Complex1 c1=new Complex1(real1,img1);
        Complex1 c2=new Complex1(real2,img2);
        Complex1 c3=new Complex1();
        
        c3=c3.add(c1,c2);
        
        System.out.println("\ncomplex no 1:"+real1+"+i"+img1);
        System.out.println("\ncomplex no 2:"+real2+"+i"+img2);
        
        System.out.println("\nThe sum of numbers = "+c3.real+"+i"+c3.img);
        
        
        
    }
    
}