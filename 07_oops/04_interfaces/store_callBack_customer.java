import java.lang.*;

class store_callBack_customer {

	public static void main(String ...args) {

		customer c1 = new customer("Vivek");
		customer c2 = new customer("Zala");
		customer c3 = new customer("any");

		store s = new store();
		s.register(c1);
		s.register(c2);
		s.register(c3);
		s.inviteSale();
	}
}

interface member {
	void callBack();
}

class store {

	member mem[] = new member[100];
	int count = 0;
	
	void register(member m) {
		mem[count++] = m;
	}

	void inviteSale() {
		for(int i = 0; i < count; i++)
			mem[i].callBack();
	}
}

class customer implements member {

	String customerName;
	
	customer(String name) {
		this.customerName = name;
	}

	public void callBack() {
		System.out.println("Sale is on " + customerName);
	}
}
