/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stude;

/**
 *
 * @author sjcet
 */
public class Stude
{
    int m1,m2,m3;
            float sum;

    public Stude()
    {
       m1=78;
       m2=89;
       m3=74;
    }
    public void calculate()
    {
        sum=m1+m2+m3;
        System.out.println("sum:"+sum);
    }
    public void perc()
    {
        float p=(sum/300)*100;
        System.out.println("percentage :"+p);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Stude s=new Stude();
       s.calculate();
       s.perc();
        // TODO code application logic here
    }
    
}
