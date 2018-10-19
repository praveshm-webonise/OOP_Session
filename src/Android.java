import java.util.*;

public class Android extends Mobile {

	private String version;
	private String mobile_number;

	Scanner scan = new Scanner(System.in);

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
		int choice;
		char input;

		do {

			System.out.println("List of Android Phone");
			System.out.println("1.Nokia");
			System.out.println("2.Samsung");
			System.out.println("3.MI");

			System.out.println("Please Enter your choice ::");
			choice = scan.nextInt();

			switch (choice) {

			case 1:
				Nokia nokia = new Nokia();
				nokia.setfeature();
				nokia.showfeature();
				System.out.println("..........................");
				nokia.setnewfeature();
				nokia.shownewfeature();
				break;
			case 2:
				Samsung samsung = new Samsung();
				samsung.setfeature();
				samsung.showfeature();
				System.out.println("..........................");
				samsung.setnewfeature();
				samsung.shownewfeature();
				break;
			case 3:
				MI mi = new MI();
				mi.setfeature();
				mi.showfeature();
				System.out.println("..........................");
				mi.setnewfeature();
				mi.shownewfeature();
				break;

			default:
				System.out.println("Invalid choice");

			}

			System.out.println("Do you want to continue..(Y/N) ::");
			input = scan.next().charAt(0);
		} while (input != 'N');
	}

	@Override
	public void makecall() {

		System.out.println("Enter the mobile number:");
		mobile_number = scan.next();
		System.out.println("You are calling to...." + mobile_number);
	}

	@Override
	public void sendsms() {
		System.out.println("Enter the mobile number:");
		mobile_number = scan.next();
		System.out.println("You are messaging to...." + mobile_number);

	}

}
