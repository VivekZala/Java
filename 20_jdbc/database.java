import java.sql.*;
import java.util.Scanner;

class database {

	public static void main(String ...args) throws Exception {

		Class.forName("org.sqlite.JDBC");

		Connection con = DriverManager.getConnection("jdbc:sqlite://home//vivek//sqlite//sqlite-tools-linux-x86-3420000//univ");

		Statement stm = con.createStatement();
		
		/*
		ResultSet rs = stm.executeQuery("select * from dept");

		int dno;
		String dname;
		while(rs.next()) {

			dno = rs.getInt("deptno");
			dname = rs.getString("dname");
			System.out.println(dno + " " + dname);
		}
		*/


		/*
		PreparedStatement stm = con.preparedStatement("select * from students where deptno = ?");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter dept number: ");
		int dno = input.nextInt();
		stm.setInt(1, dno);
		*/

		// stm.executeUpdate("insert into dept values(60, 'Chem')");
		// stm.executeUpdate("delete from dept where deptno >= 60");
		// stm.executeUpdate("update dept set dname = 'Chem' where deptno = 50");

		/*
		PreparedStatement stm = con.preparedStatement("insert into students values(?, ?, ?, ?)");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student data: ");
		int r = input.nextInt();
		String name = input.nextLine();
		String city = input.nextLine();
		int dno = input.nextInt();

		stm.setInt(1, r);
		stm.setString(2, name);
		stm.setString(3, city);
		stm.setInt(4, dno);
		stm.executeUpdate();
		*/

		// stm.executeUpdate("create table temp(a integer, b float)");
		
		stm.executeUpdate("drop table temp");

		stm.close();
		con.close();
	}
}


