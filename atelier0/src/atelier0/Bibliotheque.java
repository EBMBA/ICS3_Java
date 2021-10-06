package atelier0;

public interface Bibliotheque {
	public void ajouterLivre(String nom);
	public boolean emprunterLivre(String nom);
	public void rendreLivre(String nom);
}
