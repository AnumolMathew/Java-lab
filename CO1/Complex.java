/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author sjcet
 */
public class Complex 
{
    double real,img;
    Complex(double r,double i)
    {
       real=real;
       img=i;
    }
    public Complex sum(Complex c1,Complex c2)
    {
        Complex temp=new Complex(0,0);
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        return temp;
    }

    public static void main(String[] args) 
    {
        Complex c1=new Complex(2,6);
        Complex c2=new Complex(2,4);
        
        Complex temp =new Complex(0,0);
        temp=temp.sum(c1,c2);
        

        System.out.println("\nThe sum of numbers = "+temp.real+"+i"+temp.img);
        
        
    }
    
}
