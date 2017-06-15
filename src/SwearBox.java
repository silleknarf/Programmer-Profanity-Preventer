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

import java.util.ArrayList;


public class SwearBox
{
	ArrayList<String[]> swearBox = new ArrayList<String[]>();
	
	public SwearBox()
	{
		swearBox.add(new String[]{"Fuck", "flip"});
		// Add your own swear replacements here
	}
	
	public ArrayList<String[]> swears() 
	{
		return swearBox;
	}
}
