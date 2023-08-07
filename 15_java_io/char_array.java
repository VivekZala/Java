import java.io.*;

public class char_array {

	public static void main(String ...args) {

		char c[] = {'a', 'b', 'c', 'd', 'e'};
		try {

			CharArrayReader car = new CharArrayReader(c);

			int x;
			while((x = car.read()) != -1) {
				System.out.println((char) x);
			}
			car.close();
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}

