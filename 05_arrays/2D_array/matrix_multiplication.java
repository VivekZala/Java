import java.lang.*;
import java.util.*;

class matrix_multiplication {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row1, row2, column1, column2;
		System.out.print("Enter dimension for matrix a: ");
		row1 = input.nextInt();
		column1 = input.nextInt();
		System.out.print("Enter dimension for matrix b: ");
		row2 = input.nextInt();
		column2 = input.nextInt();

		int a[][] = new int[row1][column1];
		int b[][] = new int[row2][column2];
		int c[][] = new int[row1][column2];

		if(row1 == column2) {

			System.out.println("Enter elements for matrix a: ");
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++)
					a[i][j] = input.nextInt();
			}
			System.out.println();
			System.out.println("Enter elements for matrix b: ");
			for(int i = 0; i < b.length; i++) {
				for(int j = 0; j < b[0].length; j++)
					b[i][j] = input.nextInt();
			}
			System.out.println();
			System.out.println("Matrix a is: ");
			for(int x[] : a) {
				for(int y : x)
					System.out.print(y + " ");
				System.out.println();
			}
			System.out.println();
			System.out.println("Matrix b is: ");
			for(int x[] : b) {
				for(int y : x)
					System.out.print(y + " ");
				System.out.println();
			}
			System.out.println();
			for(int i = 0; i < c.length; i++) {
				for(int j = 0; j < c[i].length; j++) {
					for(int k = 0; k < c.length; k++)
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
			System.out.println("Multiplication matrix is : ");
			for(int x[] : c) {
				for(int y : x)
					System.out.print(y + " ");
				System.out.println();
			}
			System.out.println();
		} else {
			System.out.println("Multiplication not possible");
			System.exit(0);
		}
	}
}


