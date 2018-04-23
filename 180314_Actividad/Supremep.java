public class Supremep extends Pizza{
	
	public Supremep(){
		super.name = "Supreme-Papa John's";
	}

	@Override
	public void prep(){
		System.out.println("Preparing Papa John's Supreme Pizza");
	}

	@Override
	public void bake(){
		System.out.println("Baking Papa John's Supreme Pizza");
	}

	@Override
	public void cut(){
		System.out.println("Cutting Papa John's Supreme Pizza");
	}

	@Override
	public void box(){
		System.out.println("Boxing Papa John's Supreme Pizza");
		
	}
}