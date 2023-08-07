import java.io.*;

class file_reader {

	public static void main(String ...args) {

		try (FileReader fr = new FileReader("files/fileWriter.txt")) {

			int x;
			while((x = fr.read()) != -1) 
				System.out.print((char)x);
		} catch(FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}
