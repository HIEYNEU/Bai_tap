package Fruit;

public class Orange extends Fruit{
	private double weight;

	

	public Orange(String name, double price, int quarity, double d) {
		super(name, price, quarity);
		this.weight = d;
	}



	public double getWeight() {
		return weight;
	}
	
}
