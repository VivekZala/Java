/*
 * Properties class also implements Hash. 
 * Here key and value both should be sttring only.
 */

import java.util.*;
import java.io.*;

class properties {

	public static void main(String ...args) throws Exception {

		Properties p = new Properties();

		p.setProperty("Brand", "Asus");
		p.setProperty("Processor", "Ryzen7");
		p.setProperty("OS", "Linux");
		p.setProperty("Model", "Zenbook");

		// System.out.println(p);

		// p.store(new FileOutputStream("laptop.txt"), "Laptop");
		// p.storeToXML(new FileOutputStream("laptop.xml"), "Laptop");

		p.loadFromXML(new FileInputStream("laptop.xml"));
		System.out.println(p);
		System.out.println(p.getProperty("Brand"));

		p.load(new FileInputStream("laptop.txt"));
		System.out.println(p);

	}
}
