
public class CityField extends Fields{
	public CityField() {
		setValidation(new ConfirmEmail());
	}//end CityField

	public CityField(Confirmation c) {
		setValidation(c);
	}//end CityField(Confirmation c)
	
	@Override
	public boolean Validate(String confirm) {
		return confirmation.Confirm(confirm);
	}//end Validate

}//end CityField class
