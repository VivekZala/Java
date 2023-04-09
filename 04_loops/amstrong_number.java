import java.lang.*;
import java.util.*;

class amstrong_number {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, temp, digit, sum = 0;

		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		temp = number;
		while(temp > 0) {
			digit = temp % 10;
			sum += (digit * digit * digit);
			temp /= 10;
		}
		if(sum == number)
			System.out.println(number + " is amstrong number");
		else
			System.out.println(number + " is not amstrong number");
	}
}

