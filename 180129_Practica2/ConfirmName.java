import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfirmName implements Confirmation{
	Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
	
	@Override 
	public boolean Confirm(String confirm) {
		Matcher match = pattern.matcher(confirm);
		
		return !(match.find());
	}//end Confirm
}//end ConfirmName