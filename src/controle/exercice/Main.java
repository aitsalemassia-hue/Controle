package controle.exercice;

public class Main {
	public static void main(String[] args) {

		Livreur L1 = new LivreurMoto("A-145", "Ahmed", 10.0, 4);
		Livreur L2 = new LivreurMoto("A-987", "Omar", 8, 2);
		Livreur L3 = new LivreurCamion("B-654", "Sami", 15, 0.2);
		Livreur L4 = new LivreurCamion("B-456", "Othman", 12, 0.1);

		Livreur[] livreurs = { L1, L2, L3, L4 };

		Commande commande1 = new Commande("a34", "casa");
		Commande commande2 = new Commande("b11", "rabat");

		L2.setResponsable(L1);
		L3.setResponsable(L1);
		L4.setResponsable(L3);

		// affichage des livreurs
		System.out.println("affichage des livreurs  ");
		for (Livreur l : livreurs) {
			l.afficherDetails();

			if (l.getResponsable() != null) {
				System.out.println(" son superieur est :" + l.getResponsable().nom);
			}
		}

		Livraison livraison1 = new Livraison(30, L1, commande1);
		Livraison livraison2 = new Livraison(20, L2, commande2);
		Livraison livraison3 = new Livraison(40, L4, commande1);
		Livraison livraison4 = new Livraison(50, L3, commande2);

		Livraison[] livraisons = { livraison1, livraison2, livraison3, livraison4 };

		// affichage des livraisons
		for (Livraison liv : livraisons) {
			liv.afficherRecapitulatif();
		}
		

		// montant total
		double montantTotal = 0;

		for (Livraison liv : livraisons) {
			montantTotal += liv.calculerMontant();
		}
		System.out.println("le montant total est :" + montantTotal);

		int nblivreurs = 0;
		for (Livreur l : livreurs) {
			if (l.getResponsable() != null) {
				if (l.getResponsable() == L1) {
					nblivreurs += 1;
				}
			}
		}
		System.out.println(
				"le nombre des livreurs directement supervisés par le premier livreur à moto est :" + nblivreurs);

	}
}
