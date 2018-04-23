public class Sausage extends Ingredients{

	Pizza pizza;

	public Sausage(Pizza p){
		this.pizza = p;
		this.description = "Sausage";
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
		return pizza.prep() + " " + "with Sausage...";
	}

	@Override
	public String bake(){
		return pizza.bake() + " " + "with Sausage...";
	}

	@Override
	public String cut(){
		return pizza.cut() + " " + "with Sausage...";
	}

	@Override
	public String box(){
		return pizza.box() + " " + "with Sausage...";
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