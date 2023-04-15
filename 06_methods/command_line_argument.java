import java.lang.*;

class command_line_argument {

	public static void main(String args[]) {
		// For each loop
		for(String s : args)
			System.out.println(s);

		// Counter control loop
		for(int i = 0; i < args.length; i++)
			System.out.println(args[i]);
	}
}

