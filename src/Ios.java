import java.util.Scanner;

public class Ios extends Mobile {

	private String version;
	private String bluetooth;
	private String mobile_number;
	Scanner scan = new Scanner(System.in);

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
		int choice;
		char input;

		do {

			System.out.println("List of Android Phone");
			System.out.println("1.Apple");

			System.out.println("Please Enter your choice ::");
			choice = scan.nextInt();

			switch (choice) {

			case 1:
				Apple apple = new Apple();
				apple.setfeature();
				apple.showfeature();
				System.out.println("..........................");
				apple.setnewfeature();
				apple.shownewfeature();
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
