/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxandmin;

import java.util.Scanner;

/**
 *
 * @author Anik
 */
public class Maxandmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
      // System.out.print("Enter 2D array size : ");
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter 2D array size of Rows: ");
       int rows=sc.nextInt();
       System.out.print("Enter 2D array size of Columns: ");
       int columns=sc.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       int a[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                a[i][j]=sc.nextInt();
            }
         }
      
       
          
    int max=a[0][0];
    for (int i=0; i<rows; i++) //row
    {
        for (int j=0; j<columns; j++) //coloum
        {
            if(a[i][j]>max)
            {
                max=a[i][j];
        }

    }

}
 int min=a[0][0];
for (int i=0; i<rows; i++) //row
    {
        for (int j=0; j<columns; j++) //coloum
        {
            if(a[i][j]<min)
            {
                min=a[i][j];
        }

    }

}
 System.out.println("Maximum number is :"+max);
    System.out.println("Minimum number is :"+min);
}
      
        
    }
    

