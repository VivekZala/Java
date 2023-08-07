// Serialization - 2
// In this file will be of binary. We cannot read it.
import java.io.*;

class data_stream {

	public static void main(String ...args) throws Exception {

		// OutputStream
		FileOutputStream fos = new FileOutputStream("files/student2.txt");
		DataOutputStream dos = new DataOutputStream(fos);

		Student s = new Student();
		s.roll_no = 10;
		s.name = "John";
		s.dept = "CSE";

		dos.writeInt(s.roll_no);
		dos.writeUTF(s.name);
		dos.writeUTF(s.dept);

		// InputStream
		FileInputStream fis = new FileInputStream("files/student2.txt");
		DataInputStream dis = new DataInputStream(fis);

		Student s1 = new Student();

		// Data should be read in the same order in which it has written.
		s1.roll_no = dis.readInt();
		s1.name = dis.readUTF();
		s1.dept = dis.readUTF();

		System.out.println("Roll no: " + s1.roll_no);
		System.out.println("Name: " + s1.name);
		System.out.println("Dept: " + s1.dept);

		dos.close();
		fos.close();

	}
}

class Student {

	int roll_no;
	String name;
	String dept;
}
