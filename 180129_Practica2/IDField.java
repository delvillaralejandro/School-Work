
public class IDField extends Fields{
	public IDField() {
		setValidation(new ConfirmEmail());
	}//end IDField

	public IDField(Confirmation c) {
		setValidation(c);
	}//end IDField(Confirmation c)
	
	@Override
	public boolean Validate(String confirm) {
		return confirmation.Confirm(confirm);
	}//end Validate

}//end IDField class
