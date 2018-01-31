
public class NameField extends Fields{
	public NameField() {
		setValidation(new ConfirmName());
	}//end NameField

	public NameField(Confirmation c) {
		setValidation(c);
	}//end NameField(Confirmation c)
	
	@Override
	public boolean Validate(String confirm) {
		return confirmation.Confirm(confirm);
	}//end Validate
	
}//end NameField class
