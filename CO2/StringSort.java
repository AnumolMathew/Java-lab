/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsort;
import java.util.Scanner;

public class StringSort 
{
    int n;
    String arr[]=new String[10];
    String temp;

    public StringSort(int size) 
    {
        n=size;
    }
    
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter strigs :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextLine();
        }
    }
    
    public void sort()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;i++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\n Sorted Strings:");
        for(int i=0;i<n;i++)
        {
            System.out.println("\n"+arr[i]);
        }
    }
    public static void main(String[] args) 
    {
       

        System.out.println("Enter number of strigs to be entered :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringSort s1=new StringSort(n);
        s1.read();
        s1.sort();
        
        
    }
    
}
