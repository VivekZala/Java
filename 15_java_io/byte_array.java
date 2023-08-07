import java.io.*;

class byte_array {

	public static void main(String ...args) {

		byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

		try {
			ByteArrayInputStream bis = new ByteArrayInputStream(b);
			
			// Single byte at a time.
			/*
			int x;
			while((x = bis.read()) != -1)
				System.out.print((char)x);
			*/
			
			// Read array as full string.
			String str = new String(bis.readAllBytes());
			System.out.println(str);

			bis.close();
		} catch(IOException error) {
			System.out.println(error);
		}
	}
}
