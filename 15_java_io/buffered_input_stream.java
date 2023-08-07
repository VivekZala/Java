import java.io.*;

class buffered_input_stream {

	public static void main(String ...args) {

		try {

			FileInputStream fis = new FileInputStream("files/outputStream.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);

			// Mark is not supported.
			System.out.println("File: " + fis.markSupported());
			System.out.println("Buffer: " + bis.markSupported()); // Mark is supported.

			System.out.print((char)bis.read());
			System.out.print((char)bis.read());
			System.out.print((char)bis.read());
			bis.mark(3);
			System.out.print((char)bis.read());
			System.out.print((char)bis.read());
			bis.reset();
			System.out.print((char)bis.read());
			System.out.print((char)bis.read());


		} catch(FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}
