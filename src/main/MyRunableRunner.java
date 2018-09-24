package main;

public class MyRunableRunner {
	public static void main(String[] args) {
		Myrunable greting = new Myrunable("Hello");
		Myrunable greting2 = new Myrunable("Mama");
		Thread t1 = new Thread(greting);
		Thread t2 = new Thread(greting2);
		t2.start();
		t1.start();
	}
}
