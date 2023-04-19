import java.lang.*;

class smart_phone {

	public static void main(String ...args) {
		
		smartPhone sp = new smartPhone();

		sp.call();
		sp.sms();
		sp.click();
		sp.record();
		sp.play();
		sp.stop();
	}
}

class phone {

	public void call() {
		System.out.println("Phone is making a call");
	}
	public void sms() {
		System.out.println("Phone is sending SMS");
	}
}

interface ICamera {
	void click();
	void record();
}

interface IMusic {
	void play();
	void stop();
}

class smartPhone extends phone implements ICamera, IMusic {

	public void click() {
		System.out.println("Smart phone is clicking photo");
	}
	public void record() {
		System.out.println("Smart phone is recording video");
	}
	public void play() {
		System.out.println("Smart phone is playing music");
	}
	public void stop() {
		System.out.println("Smart phone has stopped music");
	}
}

