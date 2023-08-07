import java.io.*;

class file_input_stream {

	public static void main(String ...args) {

		try (FileInputStream fis = new FileInputStream("files/outputStream.txt")) {

			/*
			byte b[] = new byte[fis.available()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			*/

			// Read byte by byte.(ASCI or UNICODE).
			int x;
			// while((x = fis.read()) != -1) { // -> using while loop.
			//	System.out.println((char)x);
			// }
			do {
				x = fis.read();
				if(x != -1) // End of file.
					System.out.print((char)x); // Typecast to char.
			} while(x != 1);
				

		} catch(IOException error) {
			System.out.println(error);
		}
	}
}


