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


public class SwearBox {

	ArrayList<String[]> swearBox = new ArrayList<String[]>();
	public SwearBox() {
		swearBox.add(new String[]{"Fuck", "flip"});
		swearBox.add(new String[]{"Bitches", "man"});
		swearBox.add(new String[]{"Bitch", "man"});
		swearBox.add(new String[]{"Shite", "stuff"});
		swearBox.add(new String[]{"Shit", "stuff"});
		swearBox.add(new String[]{"Cunting", "unbelieveable"});
		swearBox.add(new String[]{"Cunty", "unbelieveable"});
		swearBox.add(new String[]{"Cunt", "custard pies"});
		swearBox.add(new String[]{"Scrotum", "bag"});
		swearBox.add(new String[]{"Wank", "perplexing"});
		swearBox.add(new String[]{"Mother", "pancake-"});
	}
	public ArrayList<String[]> swears() {
		return swearBox;
	}
}
