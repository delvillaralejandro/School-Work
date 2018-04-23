public class Chili extends Ingredients{

	Pizza pizza;

	public Chili(Pizza p){
		this.pizza = p;
		this.description = "Chili";
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
	public String prepare(){
		return pizza.prepare() + " " + "with Chili...";
	}

	@Override
	public String bake(){
		return pizza.bake() + " " + "with Chili...";
	}

	@Override
	public String cut(){
		return pizza.cut() + " " + "with Chili...";
	}

	@Override
	public String box(){
		return pizza.box() + " " + "with Chili...";
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