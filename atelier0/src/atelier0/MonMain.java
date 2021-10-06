package atelier0;

public class MonMain {
	
	public static void afficherEtat(Bibliotheque biblioVar ) {
		System.out.println("Affichage contenu Bibliothèque après emprunt livre 'Java' \n" + biblioVar);
	}
	
	public static void main(String[] args) {
		Bibliotheque biblio = BiblioFactory.getBiblio(1); 
		afficherEtat(biblio);
		biblio.ajouterLivre("Java");
		biblio.ajouterLivre("Autre");
		biblio.ajouterLivre("Javax");
		System.out.println("Affichage contenu Bibliothèque avant emprunt livre 'Java' \n" + biblio);
		boolean isEmpruntOk = biblio.emprunterLivre("Java");
		
		if (isEmpruntOk == true) {
			System.out.println("Emprunt livre 'Java' : Tout s'est bien passé");
		}
		// test emprunt KO déjà emprunté
		isEmpruntOk = biblio.emprunterLivre("Java");
		afficherEtat(biblio);
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Java' : KO déjà emprunté");
		}
		// test emprunt KO livre non existant
		isEmpruntOk = biblio.emprunterLivre("Javax");
		afficherEtat(biblio);
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Autre' : KO pas dans la bibliothèque");
		}
		
		biblio.rendreLivre("Autre");
		biblio.rendreLivre("dd");
		afficherEtat(biblio);
		
		System.out.println("Tout c'est bien passé");

	}
	
}

