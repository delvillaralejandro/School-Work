import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ConfirmCity implements Confirmation{
	Pattern pattern = Pattern.compile("[^a-z]+", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean Confirm(String confirm) {
		Matcher match = pattern.matcher(confirm);
		
		return !(match.find());
	}//end Confirm

}//end ConfirmCity