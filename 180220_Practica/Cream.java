
public class Cream extends Ingredients{
	//Beverage b = new something ()
	//cost
	//main ? 
	//beverage cafetaco = new mocha()
	//cafetaco = new espreso(cafetaco)
	//cafetaco = new crema(cafetaco)
	//cafetaco.cost()
	//cafetaco=new cafe() its to clean the slate
	protected Beverage bev;
	
	public Cream(Beverage b) {
		this.bev = b;
		this.description = "Cream";
	}

	@Override
	public String getDescription() {
		return this.description + " " + bev.getDescription();
	}

	@Override
	public double Cost() {
		if(bev.getSize().equals(Size.S)) {
			return bev.Cost() + 5;
		}
		else if(bev.getSize().equals(Size.M)) {
			return bev.Cost() + 6;
		}
		else {
			return bev.Cost() + 7;
		}
	}

	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return bev.getSize();
	}
	
	
	
	
}
