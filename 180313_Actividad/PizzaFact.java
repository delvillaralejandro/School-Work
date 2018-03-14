public abstract class PizzaFact {

	String name;

	public Pizza order(String name) throws NullPointerException {
		Pizza pizza = this.create(name);
		pizza.prep();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	public abstract Pizza create(String name) throws NullPointerException;

	public String getName(){
		return this.name;
	}
}