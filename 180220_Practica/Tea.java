

public class Tea extends Beverage{
	public Tea() {
		this.size = Size.S;
		this.description = "Tea";
	}
	
	public Tea(Size si) {
		this.size = si;
		this.description = "Tea";
	}

	@Override
	public double Cost() {
		if(this.size.equals(Size.S)) {
			return 20;
		}
		else if(this.size.equals(Size.M)){
			return 30;
		}
		else {
			return 50;
		}
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public Size getSize() {
		return this.size;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public void setSize(Size si) {
		this.size = si;
	}
	
}
