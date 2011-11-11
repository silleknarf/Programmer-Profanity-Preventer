import java.util.regex.*;


public class Regexes {

	public Boolean isSource(String src) {
		String[] srcSuffixes = new String[]{"java","py","v","xml"};
		boolean found = false;
		for (String suf : srcSuffixes) {
			Pattern pattern = Pattern.compile(".+?\\."+suf+"$");
			Matcher matcher = pattern.matcher(src);
	        while (matcher.find()) {
	            found = true;
	        }
		}
		return found;
	}
	public String replaceAllSwears(String str) {
		
		SwearBox swears = new SwearBox();
		for (String[] swear : swears.swears()) {
			str = replaceSwears(str, swear).toString();
		}
		return str;
	}
	public StringBuffer replaceSwears(String str, String[] swear) {
		StringBuffer myStringBuffer = new StringBuffer();
		Pattern toReplace = Pattern.compile(swear[0], Pattern.CASE_INSENSITIVE);
		Matcher myMatcher = toReplace.matcher(str);
		while (myMatcher.find()) {
		    myMatcher.appendReplacement(myStringBuffer, swear[1]);
		}
		return myMatcher.appendTail(myStringBuffer);
		
	}
	
}
