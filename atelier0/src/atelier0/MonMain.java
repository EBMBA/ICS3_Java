package atelier0;

public class MonMain {
	
	public static void afficherEtat(Bibliotheque biblioVar ) {
		System.out.println("Affichage contenu Biblioth�que apr�s emprunt livre 'Java' \n" + biblioVar);
	}
	
	public static void main(String[] args) {
		Bibliotheque biblio = BiblioFactory.getBiblio(1); 
		afficherEtat(biblio);
		biblio.ajouterLivre("Java");
		biblio.ajouterLivre("Autre");
		biblio.ajouterLivre("Javax");
		System.out.println("Affichage contenu Biblioth�que avant emprunt livre 'Java' \n" + biblio);
		boolean isEmpruntOk = biblio.emprunterLivre("Java");
		
		if (isEmpruntOk == true) {
			System.out.println("Emprunt livre 'Java' : Tout s'est bien pass�");
		}
		// test emprunt KO d�j� emprunt�
		isEmpruntOk = biblio.emprunterLivre("Java");
		afficherEtat(biblio);
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Java' : KO d�j� emprunt�");
		}
		// test emprunt KO livre non existant
		isEmpruntOk = biblio.emprunterLivre("Javax");
		afficherEtat(biblio);
		if (isEmpruntOk != true) {
			System.out.println("Emprunt livre 'Autre' : KO pas dans la biblioth�que");
		}
		
		biblio.rendreLivre("Autre");
		biblio.rendreLivre("dd");
		afficherEtat(biblio);
		
		System.out.println("Tout c'est bien pass�");

	}
	
}

