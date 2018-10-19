
public class Nokia extends Android {

	public String bname;
	public String color;
	public float weight;
	public double size;

	public void setnewfeature() {

		this.bname = "Nokia 6";
		this.color = "Silver";
		this.weight = 150;
		this.size = 6;

	}

	public void shownewfeature() {

		System.out.println("Brand Name ::" + bname);
		System.out.println("Color ::" + color);
		System.out.println("Weight ::" + weight + "gm");
		System.out.println("Size ::" + size + "inches");

	}

}
