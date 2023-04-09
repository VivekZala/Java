import java.lang.*;
import java.util.*;

class infinite_loop {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int i = 1;
		while(true) // Condition is always true.
			System.out.println(i++);
	}
}


