
public class Main {
	public static void main(String args[]) {
		Cat cat = new Cat();
		Dog german = new GShephard();
		Dog chi = new Chihuahua();
		DogAdapter catdog = new DogAdapter(cat);
		
		german.bark();
		german.bite();
		
		chi.bark();
		chi.bite();
		
		catdog.bark();
		catdog.bite();
	}
}
