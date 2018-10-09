import java.util.*;
public class Cellphone {
	
	
	public String os_type;
	public int camera;
	public int ram;
	public int hdd;
	public String display;
	public int battery;
	public String simtype;
	
	
	
	
	
	public static void main(String args[]) {
		
		int ch;
		char a;
		
		Scanner sc = new Scanner(System.in);
		do {
			
		System.out.println("Hello and Welcome...... ::");
		System.out.println("1.Android");
		System.out.println("2.IOS");
		System.out.println("Please Enter your choice ::");
		ch = sc.nextInt();
		
		switch(ch) {
		
		
		case 1	:	Android a1 = new Android();
					a1.setfeature();
					a1.showfeature();
					a1.androidbrand();
					break;
		case 2	:	Ios i1 = new Ios();
					i1.setfeature();
					i1.showfeature();
					i1.ibrand();
					break;
		
		default		:	System.out.println("Invalid choice");
		
		}
		
		System.out.println("Do you want to continue..(Y/N) ::");
		a=sc.next().charAt(0);
		}while(a!='N');
	
	}
	
}
