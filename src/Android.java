import java.util.*;

public class Android extends Cellphone{

	
	public String version;
	
	
	
	
	public void setfeature() {
	
		this.os_type = "Android Orio";
		this.version = "1.8.0";
		this.camera = 20;
		this.ram = 4;
		this.hdd = 32;
		this.display = "Full HD";
		this.battery = 4100;
		this.simtype = "Dual Sim";
	}
	
	public void showfeature() {
		System.out.println("OS type ::" + os_type);
		System.out.println("Version ::" + version);
		System.out.println("Camera  ::" + camera + "megapixel");
		System.out.println("RAM	    ::" + ram + "GB");
		System.out.println("HDD     ::" + hdd + "GB");
		System.out.println("Display ::" + display);
		System.out.println("Battery ::" + battery + "mAh");
	}
	
	public void androidbrand() {
	int ch;
	char a;
	
	Scanner sc = new Scanner(System.in);
	
	do {
		
	System.out.println("List of Android Phone");
	System.out.println("1.Nokia");
	System.out.println("2.Samsung");
	System.out.println("3.MI");

	System.out.println("Please Enter your choice ::");
	ch = sc.nextInt();
	
	switch(ch) {
	
	
	case 1	:	Nokia nk = new Nokia();
				nk.setfeature();
				nk.showfeature();
				System.out.println("..........................");
				nk.setnewfeature();
				nk.shownewfeature();
				break;
	case 2	:	Samsung sm = new Samsung();
				sm.setfeature();
				sm.showfeature();
				System.out.println("..........................");
				sm.setnewfeature();
				sm.shownewfeature();
				break;
	case 3	:	MI mi = new MI();
				mi.setfeature();
				mi.showfeature();
				System.out.println("..........................");
				mi.setnewfeature();
				mi.shownewfeature();
				break;
	
	default		:	System.out.println("Invalid choice");
	
	}
	
	System.out.println("Do you want to continue..(Y/N) ::");
	a=sc.next().charAt(0);
	}while(a!='N');
}

}	

	
	

