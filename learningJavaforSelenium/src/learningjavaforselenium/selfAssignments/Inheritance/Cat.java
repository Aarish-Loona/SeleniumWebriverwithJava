package learningjavaforselenium.selfAssignments.Inheritance;

public class Cat extends Animal{
	
	public void makeSound() {
	System.out.println("Cats make sound while fighting");	
	}

	public static void main(String[] args) {
		Animal cat = new Animal();
		Cat Meow = new Cat();
		cat.makeSound();
		Meow.makeSound();
	}
}
