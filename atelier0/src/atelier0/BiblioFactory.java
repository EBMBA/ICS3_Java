package atelier0;

import java.util.HashMap;
import java.util.Map;

public class BiblioFactory {
	private static Map<Integer, Bibliotheque> mapBiblio;
	static {
		mapBiblio = new HashMap<Integer, Bibliotheque>();
		mapBiblio.put(1, new Bibliotheque1());
		mapBiblio.put(2, new Bibliotheque2());
	}
	public static Bibliotheque getBiblio(int key) {
		return mapBiblio.get(key);
	}
}

