package atelier0;

import java.util.HashMap;
import java.util.Map;

public class Bibliotheque1 implements Bibliotheque{
	private Map<String, Livre> liste;
	
	public void ajouterLivre(String nom) {
		Livre l = new Livre(nom);
		liste.put(nom, l);
	}
	
	public boolean emprunterLivre(String nom) {
		Livre l = liste.get(nom);
		boolean retourne = false; 
		if (l != null) {
			retourne = l.emprunter();
		}
		return retourne;
	}
	
	public void rendreLivre(String nom) {
		Livre l = liste.get(nom);
		if (l != null) {
			l.rendre();
		}
	}
	
	Bibliotheque1() {
		liste = new HashMap<String, Livre>();
	}

	@Override
	public String toString() {
		return "Bibliotheque [liste=" + liste + "]";
	}

}
