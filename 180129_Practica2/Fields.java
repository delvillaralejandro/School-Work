
public abstract class Fields {
	public Confirmation confirmation;
	private String value;
	
	public void setValidation(Confirmation c) {
		this.confirmation = c;
	}//end setValidation
	
	public Confirmation getValidation() {
		return confirmation;
	}//end getValidation
	
	public String getValue() {
		return value;
	}//end getValue
	
	public boolean setValue(String confirm) {
		if(Validate(confirm)) {
			this.value = confirm;
			return true;
		}//end if
		
		else {
			return false;
		}//end false
	}//end setValue
	
	public boolean Validate(String confirm) {
		return false;
	}//end Validate
}//end Fields
