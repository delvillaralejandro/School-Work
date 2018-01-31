
public class ConfirmEmail implements Confirmation{
	@Override
	public boolean Confirm(String confirm) {
		if(confirm.contains("@") && confirm.contains(".")) {
			return true;
		}//end if
		
		else{
			return false;
			}//end else
	}//end Confirm
}//end ConfirmEmail
