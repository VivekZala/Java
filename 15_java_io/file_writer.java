import java.io.*;

class file_writer {

	public static void main(String ...args) {

		try (FileWriter fw = new FileWriter("files/fileWriter.txt")) {

			String str = "Java Programming\n";
			fw.write(str);
			fw.close();
		} catch(FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}

