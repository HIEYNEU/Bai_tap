package Fruit;

public class Apple extends Fruit{
	private int sugar;

	public Apple(String name, double price, int quarity, int sugar) {
		super(name, price, quarity);
		this.sugar = sugar;
	}

	public int getSugar() {
		return sugar;
	}
	
}
