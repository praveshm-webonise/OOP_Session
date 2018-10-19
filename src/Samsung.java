
public class Samsung extends Android {

	public String sampay;
	public String bname;
	public String color;
	public float weight;
	public double size;

	public void setnewfeature() {

		this.bname = "Samsung Y1";
		this.color = "Black";
		this.weight = 200;
		this.size = 5.5;
		this.sampay = "Samsung Pay is available";
	}

	public void shownewfeature() {

		System.out.println("Brand Name ::" + bname);
		System.out.println("Color ::" + color);
		System.out.println("Weight ::" + weight + "gm");
		System.out.println("Size ::" + size + "inches");
		System.out.println("Samsung Pay ::" + sampay);

	}

}
