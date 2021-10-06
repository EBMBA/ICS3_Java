package atelier0;


public class Bibliotheque2 implements Bibliotheque {
	private Livre[] liste;
	private int i;
	
	public void ajouterLivre(String nom) {
		Livre l = new Livre(nom);
		putLivre(l);
	}
	
	private void putLivre(Livre l) {
		if (i < 101) {
			liste[i]=l;
			i++;
		}
	}
	
	private Livre getLivre(String nom) {
		int compteur = -1;
		try {
			do {
				compteur++;
			} while (liste[compteur].nom != nom);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return liste[compteur];
	}
	
	public boolean emprunterLivre(String nom) {
		Livre l = getLivre(nom);
		boolean retourne = false; 
		if (l != null) {
			retourne = l.emprunter();
		}
		return retourne;
	}
	
	
	public void rendreLivre(String nom) {
		Livre l = getLivre(nom);
		if (l != null) {
			l.rendre();
		}

	}
	
	
	public Bibliotheque2() {
		this.liste = new Livre[100];	
		i = 0;	
	}

	@Override
	public String toString() {
		String texteAfficher = ""; 
		for (Livre livre : liste) {
			if (livre != null) {
				texteAfficher += "Bibliotheque2 [liste=" + livre + "]\n";
			}
			
		}
		return texteAfficher;
	}

}
