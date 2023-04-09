/*
 * 	Pattern - 9
 * 		        *
 * 		      * *
 * 		    * * *
 * 		  * * * *
 * 		* * * * *
 */
 
import java.lang.*;
import java.util.*;

class pattern_9 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row;
		System.out.print("Enter rows: ");
		row = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= row; j++) {
				if(i + j > row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
