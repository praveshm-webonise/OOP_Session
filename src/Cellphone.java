import java.util.*;

public class Cellphone {

	public static void main(String args[]) {

		int choice;
		char input;

		Scanner scan = new Scanner(System.in);
		do {

			System.out.println("Hello and Welcome...... ::");
			System.out.println("1.Android");
			System.out.println("2.IOS");
			System.out.println("Please Enter your choice ::");
			choice = scan.nextInt();

			switch (choice) {

			case 1:
				Android android = new Android();
				android.setfeature();
				android.showfeature();
				android.androidbrand();
				android.makecall();
				android.sendsms();
				break;
			case 2:
				Ios ios = new Ios();
				ios.setfeature();
				ios.showfeature();
				ios.ibrand();
				ios.makecall();
				ios.sendsms();
				break;

			default:
				System.out.println("Invalid choice");

			}

			System.out.println("Do you want to continue..(Y/N) ::");
			input = scan.next().charAt(0);
		} while (input != 'N');

	}

}
