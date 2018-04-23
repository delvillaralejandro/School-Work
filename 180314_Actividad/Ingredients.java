public abstract class Ingredients extends Pizza {
	String description;
	public abstract String getDescription();

	public void setDescription(String s){
		this.description = s;
	}
}