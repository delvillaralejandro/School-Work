import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ConfirmPhone implements Confirmation{
	Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean Confirm(String confirm) {
		Matcher match  = pattern.matcher(confirm);
		
		return (match.find());
	}//end Confirm
}//end ConfirmPhone
