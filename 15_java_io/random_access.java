import java.io.*;

class random_access {

	public static void main(String ...args) {

		try {
			RandomAccessFile rf = new RandomAccessFile("files/text.txt", "rw");

			// Reading full content of file byte at a time.
			/*
			int c;
			while((c = rf.read()) != -1) 
				System.out.print((char)c);
			*/

			// Reading each byte at a time.
			System.out.println((char)rf.read());
			System.out.println((char)rf.read());
			System.out.println((char)rf.read());
			rf.write('d'); // It will override the content of current pointer and move on to next.			
			System.out.println((char)rf.read());
			rf.skipBytes(2); // This will skip 2 bytes from current pointer.
			System.out.println((char)rf.read());
			rf.seek(3); // From the begining it will print 3rd place content.
				    

			// Get current pointer of file.
			System.out.println(rf.getFilePointer());
			System.out.println();

			// Remaining content of file.
			int x;
			while((x = rf.read()) != -1) {
				System.out.print((char)x);
			}
		} catch (FileNotFoundException error) {
			System.out.println(error);
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}

