package Fruit_Buoi_6;

public class Apple extends Fruit{
	private int sugar;
	private String vitamin;
	public Apple(String name, double price, int quarity, int sugar,String vitamin) {
		super(name, price, quarity);
		this.sugar = sugar;
	}
	
	public int getSugar() {
		return sugar;
	}

	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin cua "+this.getName()+" la "+this.vitamin);
	}
	
}
