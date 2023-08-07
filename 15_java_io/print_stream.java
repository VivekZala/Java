// Serialization - 1
import java.io.*;

class print_stream {

	public static void main(String ...args) throws Exception {

		// OutputStream
		FileOutputStream fos = new FileOutputStream("files/student1.txt");
		PrintStream ps = new PrintStream(fos);

		Student s = new Student();
		s.roll_no = 10;
		s.name = "John";
		s.dept = "CSE";

		ps.println(s.roll_no);
		ps.println(s.name);
		ps.println(s.dept);

		// InputStream
		FileInputStream fis = new FileInputStream("files/student1.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		Student s1 = new Student();
		s1.roll_no = Integer.parseInt(br.readLine());
		s1.name = br.readLine();
		s1.dept = br.readLine();

		System.out.println("Roll no: " + s1.roll_no);
		System.out.println("Name: " + s1.name);
		System.out.println("Dept: " + s1.dept);

		ps.close();
		fos.close();
	
	}
}

class Student {

	int roll_no;
	String name;
	String dept;
}
