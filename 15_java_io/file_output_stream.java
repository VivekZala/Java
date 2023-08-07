import java.io.*;

class file_output_stream {

	public static void main(String ...args) {

		try {
			FileOutputStream fos = new FileOutputStream("files/outputStream.txt");
			String str = "Java Programming\n";
			
			// Using byte array.
			byte b[] = str.getBytes();
			for(byte x: b)
				fos.write(x);
			
			// Using string.
			fos.write(str.getBytes());

			// Using offset and length.
			fos.write(b, 5, str.length() - 5);

			fos.close();
			

		} catch(FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}
