package Fruit;

public class Banana extends Fruit{
	private double kali;

	public Banana(String name, double price, int quarity, double kali) {
		super(name, price, quarity);
		this.kali = kali;
	}

	public double getKali() {
		return kali;
	}
	
}
