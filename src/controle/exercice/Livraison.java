package controle.exercice;

public class Livraison {
	private double distance;
	private Livreur livreur;
	Commande commande;

	public Livraison(double distance, Livreur livreur, Commande commande) {
		super();
		this.distance = distance;
		this.livreur = livreur;
		this.commande = commande;
	}

	public double calculerMontant() {
		return livreur.calculerFrais(distance);

	}

	public void afficherRecapitulatif() {
		System.out.println("Livraison [distance=" + distance);
		livreur.afficherDetails();
		System.out.println(commande);

	}

}
