package myProject;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dogs Chew...");
	}

	@Override
	public void move() {
		System.out.println("Dogs walk...");
	}

}
