/******************************************************************************
 *  Compilation:  javac -d bin Stop_Watch.java
 *  Execution:    java -cp bin com.bridgelabz.util.Stop_Watch (start,end)  
 *  Purpose: Determines stopwatch implementation to print elapsed time 
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-17-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;

public class Stop_Watch {
 public static void main(String[] args)
 {
	 int start=0;
	 int end=10;
	 Utility.stopWatch(start,end);
 }
}
