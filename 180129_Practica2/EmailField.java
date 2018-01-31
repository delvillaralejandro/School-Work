
public class EmailField extends Fields{
	public EmailField() {
		setValidation(new ConfirmEmail());
	}//end Email Field

	public EmailField(Confirmation c) {
		setValidation(c);
	}//end EmailField(Confirmation c)
	
	@Override
	public boolean Validate(String confirm) {
		return confirmation.Confirm(confirm);
	}//end Validate
	
}//end EmailField class
