import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ConfirmID implements Confirmation{
	Pattern pattern = Pattern.compile("[^0-9]", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean Confirm(String confirm) {
		Matcher match = pattern.matcher(confirm);
		
		return (match.find());
	}//end Validate

}//end Confirm ID
