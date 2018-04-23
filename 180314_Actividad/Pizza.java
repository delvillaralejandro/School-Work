public abstract class Pizza{
    String name;
    Size size;
    
    public abstract void prep();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
    public abstract double cost();
    
    public String getName(){
        return this.name;
    }

	public Size getSize(){
		return this.size;
	}

	public String getDescription(){
		return this.description;
	}

	public void setSize(Size s){
		this.size = s;
	}

	public void setDescription(String d){
		this.description = d;
	}
    
}