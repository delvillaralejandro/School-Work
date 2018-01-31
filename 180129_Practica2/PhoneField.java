
public class PhoneField extends Fields{
	public PhoneField() {
		setValidation(new ConfirmPhone());
	}//end PhoneField

	public PhoneField(Confirmation c) {
		setValidation(c);
	}//end PhoneField(Confirmation c)
	
	@Override
	public boolean Validate(String confirm) {
		return confirmation.Confirm(confirm);
	}//end Validate
	
}//end PhoneField class
