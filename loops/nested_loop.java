import java.lang.*;
import java.util.*;

class nested_loop {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row, column;
		System.out.print("Enter rows: ");
		row = input.nextInt();
		System.out.print("Enter columns: ");
		column = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= column; j++) {
				System.out.print("[" + i + ", " + j + "] ");
			}
			System.out.println();
		}
	}
}

