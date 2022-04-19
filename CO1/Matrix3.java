/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix3;
import java.util.Scanner;

public class Matrix3 
{
    int mat[][]=new int[10][10];
    int trans[][]=new int[10][10];
    int m,n;
    Matrix3(int a,int b)
            {
               m=a;
               n=b;
            }
    public void readmat()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements :");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                 mat[i][j]=sc.nextInt();
            }
    }
    public void printMat()
    {
        System.out.println("\nThe matrix is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(mat[i][j]+"\t");
               
            }
            System.out.println();
             
        }
    }
    public void transpose()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                trans[i][j]=mat[j][i];
            }
        }
       System.out.println("\nTranspose of the matrix is:"); 
       for(int i=0;i<m;i++)
       {
            for(int j=0;j<n;j++)
            {
               System.out.print(trans[i][j]+"\t");
            }
            System.out.println();  
        }
    }

    public static void main(String[] args) 
    {
        Matrix3 m1=new Matrix3(3,3);
        m1.readmat();
        m1.printMat();
        m1.transpose();
    }
    
}
