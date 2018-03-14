public class Cheesep extends Pizza{
	
	public Cheesep(){
		super.name = "Cheese-Papa John's";
	}

	@Override
	public void prep(){
		System.out.println("Preparing Papa John's Cheese Pizza");
	}

	@Override
	public void bake(){
		System.out.println("Baking Papa John's Cheese Pizza");
	}

	@Override
	public void cut(){
		System.out.println("Cutting Papa John's Cheese Pizza");
	}

	@Override
	public void box(){
		System.out.println("Boxing Papa John's Cheese Pizza");
		System.out.println(" ");
	}
}