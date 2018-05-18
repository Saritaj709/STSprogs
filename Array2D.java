/******************************************************************************
 *  Compilation:  javac -d bin Array2D.java
 *  Execution:    java -cp bin com.bridgelabz.util.Array2D (m,n)  
 *  Purpose: Determines 2D Array for given rows and columns
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-17-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionprogs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Array2D {
	public static void main(String[] args)
	{     
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter number of rows: ");
				int m = sc.nextInt();
				System.out.println("Enter number of columns: ");
				int n = sc.nextInt(); 
				        
				//calling methods
				int [][] a  =Utility.arrayInt(m,n);
				double [][] b  =Utility.arrayDouble(m,n);
				String [][] c  =Utility.arrayBoolean(m,n);
				        
				//calling display method
				Utility.display(a,b,c,m,n);
				        
			}
			
	}


