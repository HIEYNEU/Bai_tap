package hieyPro;

import java.util.Scanner;

public class Students {
	String Name;
	int Age;
	String Lop;
	String object;
	int score;
	
	public Students() {
		super();
	}
	public Students(String Lop, String object, int score, int Age, String Name) {
		this.Name = Name;
		this.Age = Age;
		this.Lop = Lop;
		this.object = object;
		this.score = score;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void input() {
		Scanner in=new Scanner(System.in);
		System.out.print("Nhập tên sinh viên: ");
		Name=in.nextLine();
		System.out.print("Nhập tuổi sinh viên: ");
		Age=Integer.parseInt(in.nextLine());
		System.out.print("Nhập lớp sinh viên: ");
		Lop=in.nextLine();
		System.out.print("Nhập môn học: ");
		object=in.nextLine();
		System.out.print("Nhập điểm: ");
		score=in.nextInt();
	}
	@Override
	public String toString() {
		return "Students [Name=" + Name + ", Age=" + Age + ", Class=" + Lop + ", object=" + object + ", score="
				+ score + "]";
	}
	public void out() {
		System.out.println(toString());
	}
}
