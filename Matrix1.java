/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix1;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Matrix1 {
    int row,col;
    int m[][]=new int[10][10];
    
    Matrix1(int r,int c){
    row=r;
    col=c;
    
    }
    
    public void readMat()
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the elements for matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m[i][j]=sc.nextInt();
                
            }
         
        }
        
    }
    
    public void printMat(){
        System.out.println("\nThe matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(m[i][j]+"\t");
               
            }
            System.out.println();
             
        }
    }
    
    public void add(Matrix1 m2){
        int sum[][]=new int[row][col];
         if(this.row!=m2.row && this.col!=m2.col){
             System.out.println("\nAddition not possible");
            
    }
         else{
             
             for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               sum[i][j]=this.m[i][j]+m2.m[i][j];
            }
        }
             System.out.println("\nMatrix after addition :\n");
             for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(sum[i][j]+"\t");
               
            }
            System.out.println();
             
        }
             
         }
        
    }
       

    
    public static void main(String[] args) {
        int m,n,p,q;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the no of rows and cols for first matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        
       Matrix1 m1=new Matrix1(m,n);
       m1.readMat();
       m1.printMat();
       
        System.out.println("Enter the no of rows and cols for second matrix");
        p=sc.nextInt();
        q=sc.nextInt();
        
       Matrix1 m2=new Matrix1(p,q);
       m2.readMat();
       m2.printMat();
       
       m1.add(m2);
       
       
       
        
        
        
    }
    
}