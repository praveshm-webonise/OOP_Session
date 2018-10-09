import java.util.Scanner;

public class Ios extends Cellphone{
	
public String version;
public String bluetooth;
	
	
	
	
	public void setfeature() {
	
		this.os_type = "IOS";
		this.version = "10";
		this.camera = 20;
		this.ram = 8;
		this.hdd = 64;
		this.display = "Full HD";
		this.battery = 3300;
		this.simtype = "Single Sim";
		this.bluetooth = "Not available";
	}
	
	public void showfeature() {
		System.out.println("OS type ::" + os_type);
		System.out.println("Version ::" + version);
		System.out.println("Camera  ::" + camera + "megapixel");
		System.out.println("RAM	    ::" + ram + "GB");
		System.out.println("HDD     ::" + hdd + "GB");
		System.out.println("Display ::" + display);
		System.out.println("Battery ::" + battery + "mAh");
		System.out.println("Bluetooth ::" + bluetooth);

	}
	
	public void ibrand() {
		int ch;
		char a;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.println("List of Android Phone");
		System.out.println("1.Apple");
		
	

		System.out.println("Please Enter your choice ::");
		ch = sc.nextInt();
		
		switch(ch) {
		
		
		case 1	:	Apple ap = new Apple();
					ap.setfeature();
					ap.showfeature();
					System.out.println("..........................");
					ap.setnewfeature();
					ap.shownewfeature();
					break;

		
		default		:	System.out.println("Invalid choice");
		
		}
		
		System.out.println("Do you want to continue..(Y/N) ::");
		a=sc.next().charAt(0);
		}while(a!='N');
	}

}
