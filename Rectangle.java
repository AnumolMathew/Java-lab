/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

public class Rectangle 
{
    int l,b;

    public Rectangle(int a,int c)
    {
        l=a;
        b=c;
    }
    public void area()
    {
        float ar=l*b;
        System.out.println("area is:"+ar);
    }
    public void para()
    {
        float par=2*(l+b);
        System.out.println("parameter is:"+par);
    }

    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle(7,9);
        Rectangle r1=new Rectangle(6,8);
        r.area();
        r.para();
        r1.area();
        r1.para();
       
    }
    
}
