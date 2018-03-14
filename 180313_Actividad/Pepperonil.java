public class Pepperonil extends Pizza{
	
	public Pepperonil(){
		super.name = "Pepperoni Pizza-Liru Sisa";
	}

	@Override
	public void prep(){
		System.out.println("Preparing Liru Sisa Pepperoni Pizza");
	}

	@Override
	public void bake(){
		System.out.println("Baking Liru Sisa Pepperoni Pizza");
	}

	@Override
	public void cut(){
		System.out.println("Cutting Liru Sisa Pepperoni Pizza");
	}

	@Override
	public void box(){
		System.out.println("Boxing Liru Sis Pepperoni Pizza");
		System.out.println(" ");
	}
}