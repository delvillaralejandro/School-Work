public class Ham extends Ingredients{

	Pizza pizza;

	public Ham(Pizza p){
		this.pizza = p;
		this.description = "Ham";
	}

	@Override
	public double cost(){
		if(pizza.getSize().equals(Size.S)){
			return pizza.cost() + 6;
		}
		else if(pizza.getSize().equals(Size.M)){
			return pizza.cost() + 8;
		}
		else{
			return pizza.cost() + 10;
		}
	}

	@Override
	public String prep(){
		return pizza.prep() + " " + "with Ham...";
	}

	@Override
	public String bake(){
		return pizza.bake() + " " + "with Ham...";
	}

	@Override
	public String cut(){
		return pizza.cut() + " " + "with Ham...";
	}

	@Override
	public String box(){
		return pizza.box() + " " + "with Ham...";
	}

	@Override
	public String getDescription(){
		return this.description + " " + pizza.getDescription();
	}

	@Override
	public Size getSize(){
		return pizza.getSize();
	}

}