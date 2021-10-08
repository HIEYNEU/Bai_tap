package Fruit_Buoi_6;

public abstract class Fruit {
	private int id;
	private String name;
	private double price;
	private int quarity;
	static private int count;
	public Fruit(String name, double price, int quarity) {
		super();
		this.name = name;
		this.price = price;
		this.quarity = quarity;
		this.id=++count;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuarity(int quarity) {
		this.quarity = quarity;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuarity() {
		return quarity;
	}
	public void addQuarity(int quarity) {
		this.quarity=this.quarity+quarity;
	}
	abstract public void vitamin();
}
