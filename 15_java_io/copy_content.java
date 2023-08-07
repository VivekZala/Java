/*
 * 	Copy the content of 1 file to another file in lower case.
 */

import java.io.*;

class copy_content {

	public static void main(String ...args) {

		try {
			FileInputStream fis = new FileInputStream("files/source1.txt");
			FileOutputStream fos = new FileOutputStream("files/source2.txt");

			int b;
			while((b = fis.read()) != -1) {
				if(b >= 65 && b < 90)
					fos.write(b + 32);
				else
					fos.write(b);
			}
			fis.close();
			fos.close();
		} catch(FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}

