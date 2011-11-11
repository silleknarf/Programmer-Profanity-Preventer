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
