/*10. Sum of three Integer adds to ZERO
a. Desc ­> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P ­> N number of integer, and N integer input array
c. Logic ­> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P ­> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets. */
/******************************************************************************
 *  Compilation:  javac -d bin ThreeInteger.java
 *  Execution:    java -cp bin com.bridgelabz.util.ThreeInteger a[] x
 *  
 *  Purpose:Determines the count when sum of three elements is 0
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-17-2-18
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;
public class ThreeInteger {
 public static void main(String[] args)
 {
	 int count=0;
	 int x;
	int a[]= {0,-1,-2,3,1,2,-3,-6,6};
	x=a.length;
	 Utility.countTriplet(a,x);
	
 }

}
