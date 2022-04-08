/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strmanipulations;
import java.util.Scanner;
/**
 *
 * @author sjcet
 */
public class StrManipulations
{
    String str1,str2;

    public StrManipulations(String s1)
    {
        str1=s1;
    }
    public void strLen()
    {
        System.out.println("\n The length of string1 :"+str1.length());
    }
    public void strConcat()
    {
        System.out.println("\n Concatenated String 'HELLO':"+(str1.concat("HELLO")));
    }
    public void charpos()
    {
        System.out.println("\n Character at position 4 in string1:"+(str1.charAt(3)));   
    }
    
    public void compare()
    {
        System.out.println("\n Compare to 'JAVA '"+(str1.compareTo("JAVA")));
    }
    public static void main(String[] args)
    {
        String str;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the String");
        str=sc.nextLine();
        
        StrManipulations s1=new StrManipulations(str);
                s1.strLen();
                s1.strConcat();
                s1.charpos();
                s1.compare();
        
    }
    
}
