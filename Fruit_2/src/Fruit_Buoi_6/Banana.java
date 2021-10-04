package Fruit_Buoi_6;

public class Banana extends Fruit{
	private double kali;
	private String vitamin;
	
	public Banana(String name, double price, int quarity, double kali, String vitamin) {
		super(name, price, quarity);
		this.kali = kali;
		this.vitamin = vitamin;
	}
	public double getKali() {
		return kali;
	}
	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin cua "+this.getName()+" la "+this.vitamin);
	}
	
}
