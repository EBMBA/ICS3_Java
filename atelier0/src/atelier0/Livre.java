package atelier0;

public class Livre {
	String nom;
	boolean emprunt = false;
	
	@Override
	public String toString() {
		return "Livre [nom=" + nom + ", emprunt=" + emprunt + "]";
	}
	
	public boolean emprunter() {
		this.emprunt = true ;
		return this.emprunt;
	}
	
	public boolean  rendre() {
		this.emprunt = false;
		return this.emprunt;
	}
	
	Livre(String nom){
		this.nom = nom; 
	}

	public String getNom() {
		return nom;
	}
}
