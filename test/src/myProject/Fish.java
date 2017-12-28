package myProject;

public class Fish implements Animal {

	@Override
	public void eat() {
		System.out.println("Fish swallows...");
	}

	@Override
	public void move() {
		System.out.println("Fish Swimms");
	}

}
