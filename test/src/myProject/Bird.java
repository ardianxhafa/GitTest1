package myProject;

public class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("Birds swallows..");
	}

	@Override
	public void move() {
		System.out.println("Birds fly..");
	}

}
