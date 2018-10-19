
public class MI extends Android {

	public String miui;
	public String bname;
	public String color;
	public float weight;
	public double size;

	public void setnewfeature() {

		this.bname = "MI A2";
		this.color = "Gold";
		this.weight = 160;
		this.size = 6;
		this.miui = "MIUI 9";

	}

	public void shownewfeature() {

		System.out.println("Brand Name ::" + bname);
		System.out.println("Color ::" + color);
		System.out.println("Weight ::" + weight + "gm");
		System.out.println("Size ::" + size + "inches");
		System.out.println("MIUI ::" + miui);

	}

}
