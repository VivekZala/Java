import java.io.*;

class buffered_reader {

	public static void main(String ...args) {

		try {

			FileReader fis = new FileReader("files/outputStream.txt");

			BufferedReader br = new BufferedReader(fis);
			// Mark is not supported.
			System.out.println("File: " + fis.markSupported());
			System.out.println("Buffer: " + br.markSupported()); // Mark is supported.

			System.out.print((char)br.read());
			System.out.print((char)br.read());
			System.out.print((char)br.read());
			br.mark(3);
			System.out.print((char)br.read());
			System.out.print((char)br.read());
			br.reset();
			System.out.print((char)br.read());
			System.out.print((char)br.read());
			System.out.println();

			// readLine()
			System.out.println("Remaining string");
			System.out.println("String " + br.readLine());


		} catch(FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}
