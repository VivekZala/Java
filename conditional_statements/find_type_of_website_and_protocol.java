import java.lang.*;
import java.util.*;

class find_type_of_website_and_protocol {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String url;
		System.out.print("Enter url: ");
		url = input.next();

		String type = url.substring(0, url.indexOf(":"));
		String protocol = url.substring(url.indexOf(".") + 1, url.length()); // lastIndedOf()
		String domain = url.substring(url.indexOf("/") + 2, url.indexOf("."));
		System.out.println("Domain: " + domain);

		if(type.equals("http"))
			System.out.println("Type: " + type + " -> Hyper Text Transfer Protocol");
		else if(type.equals("https"))
			System.out.println("Type: " + type + " -> Hyper Text Transfer Protocol Secure");
		else if(type.equals("ftp"))
			System.out.println("Type: " + type + " -> File Transfer Protocol");
		else
			System.out.println("Type: Invalid");

		if(protocol.equals("com"))
			System.out.println("Protocol: " + protocol + " -> Commercial");
		else if(protocol.equals("net"))
			System.out.println("Protocol: " + protocol + " -> Network");
		else if(protocol.equals("org"))
			System.out.println("Protocol: " + protocol + " -> Organization");
		else if(protocol.equals("gov"))
			System.out.println("Protocol: " + protocol + " -> Government");
		else
			System.out.println("Protocol: Invalid");

	}
}


