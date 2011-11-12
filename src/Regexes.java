/* This file is part of the Programmer Profanity Preventer.

Programmer Profanity Preventer is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Programmer Profanity Preventer is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Programmer Profanity Preventer.  If not, see <http://www.gnu.org/licenses/>. */

import java.util.regex.*;

public class Regexes {

	public Boolean isSource(String src) {
		String[] srcSuffixes = new String[]{"java","py","v","xml","c","h","pl","html","php","css","js","hs","sql","m","mat","rb","cpp","cs","sh","as","scpt"};
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
