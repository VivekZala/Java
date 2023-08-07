import java.io.*;

class file_class {

	public static void main(String ...args) {
	
		File f = new File("files");
		
		// Whether it is a directory.
		System.out.println(f.isDirectory());

		// String list of file present in that directory.
		/*
		String file_list[] = f.list();
		
		System.out.println(f.getName());
		for(String file: file_list) {
			System.out.println("|`-> " + file);
		}
		*/

		// File list of file present in that directory.
		File file_list[] = f.listFiles();
		System.out.println(f.getName());
		for(File file: file_list) {
			System.out.println("|`-> " + file.getName());
			System.out.println("\t[Path -> " + file.getPath() + "]");
			System.out.print("\t[Parent -> " + file.getParent() + "]\n");
			System.out.println();
		}
	}
}
