import java.lang.*;

class adding_numbers_using_command_line {

	public static void main(String args[]) {
		
		double sum = 0;
		for(String s : args) {
			// if number then only add. Otherwise it throws exception for any alphabets.
			if(s.matches("[0-9\\/]+"))
				sum = sum + Double.parseDouble(s);
		}
		System.out.println("Sum is " + sum);
	}
}


