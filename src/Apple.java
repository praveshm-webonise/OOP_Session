
public class Apple extends Ios {

	public String applepay;
	public String bname;
	public String color;
	public float weight;
	public double size;

	public void setnewfeature() {

		this.bname = "Iphone 6";
		this.color = "Silver";
		this.weight = 120;
		this.size = 6;
		this.applepay = "Apple Pay is available";
	}

	public void shownewfeature() {

		System.out.println("Brand Name ::" + bname);
		System.out.println("Color ::" + color);
		System.out.println("Weight ::" + weight + "gm");
		System.out.println("Size ::" + size + "inches");
		System.out.println("Apple Pay ::" + applepay);

	}

}
