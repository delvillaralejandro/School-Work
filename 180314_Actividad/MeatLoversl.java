public class MeatLoversl extends Pizza{
	
	public MeatLoversl(){
		super.name = "Meat Lovers Pizza-Liru Sisa";
	}

	@Override
	public void prep(){
		System.out.println("Preparing Liru Sisa Meat Lovers Pizza");
	}

	@Override
	public void bake(){
		System.out.println("Baking Liru Sisa Meat Loves Pizza");
	}

	@Override
	public void cut(){
		System.out.println("Cutting Liru Sisa Meat Lovers Pizza");
	}

	@Override
	public void box(){
		System.out.println("Boxing Liru Sis Meat Lovers Pizza");
		System.out.println(" ");
	}
}