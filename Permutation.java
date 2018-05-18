/*Write static functions to return all permutation of a String using iterative method and
Recursion method. Check if the arrays returned by two string functions are equal.
*/
/******************************************************************************
 *  Compilation:  javac -d bin Permutation.java
 *  Execution:    java -cp bin com.bridgelabz.util.Permutation n
 *  
 *  Purpose: Determines permutation of entered string
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-17-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;
import java.util.Scanner;

public class Permutation {
public static void main(String[] args)
{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	str=sc.next();
	int n=str.length();
	Utility.permute(str,0,n-1);
}

}
