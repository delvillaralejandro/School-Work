
public class Sugar extends Ingredients{

	protected Beverage bev;
	
	public Sugar(Beverage b) {
		this.bev = b;
		this.description = "Sugar";
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
