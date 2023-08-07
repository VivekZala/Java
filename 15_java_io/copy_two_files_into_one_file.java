import java.io.*;

class copy_two_files_into_one_file {

	public static void main(String ...args) {

		try {
			FileInputStream fis1 = new FileInputStream("files/source1.txt");
			FileInputStream fis2 = new FileInputStream("files/source2.txt");
			FileOutputStream fos = new FileOutputStream("files/destination.txt");
			SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

			int b;
			while((b = sis.read()) != -1)
				fos.write(b);
			sis.close();
			fis1.close();
			fis2.close();
			fos.close();
		} catch(FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}
