class Dog {
	int size;
	String name;

	void bark() {
		if (size > 60){
			System.out.println("Woof! Woof!");
		} else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yap! Yap!");
		}
	}

	int giveSecret() {
		return 42;
	}

}
class DogTestDrive {
	public static void main (String[] args){
		Dog rover = new Dog();
		rover.size = 30;
		System.out.println(rover.giveSecret());
		rover.bark();
	}
} 
