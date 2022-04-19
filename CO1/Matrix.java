/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.*;

public class Matrix{

   
    public static void main(String[] args) {
        int m,n,p,q;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the no of rows and cols for first matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        
        int M1[][]=new int[m][n];
        
        int Sum[][]=new int[m][n];
        
        System.out.println("Enter the elements for first matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                M1[i][j]=sc.nextInt();
                
            }
         
        }
        
        System.out.println("Enter the no of rows and cols for fsecond matrix");
        p=sc.nextInt();
        q=sc.nextInt();
        
        int M2[][]=new int[p][q];
        
        System.out.println("Enter the elements of second matrix");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                M2[i][j]=sc.nextInt();
                
            }
        }
        if(m==p){
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               Sum[i][j]=M1[i][j]+M2[i][j];
            }
        }
        
        System.out.println("The sum of matices:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(Sum[i][j]+"\t");
               
            }
            System.out.println();
             
        }
        
        
            
        }
        else {
                System.out.println("\nThe matrix Addition not possible");
                }
        
        
    }
    
}
