package controle.exercice;

public  abstract class Livreur {
	protected String identifiant;
	protected String nom;
	protected  double tarifKm ;
	private Livreur responsable;
	
	
	
	
	public Livreur(String identifiant, String nom, double tarifKm) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
	}



	public String getNom() {
		return nom;
	}
	
	
	public abstract double calculerFrais(double distance);
	
	
	
	public void afficherDetails() {
		System.out.println("Livreur [identifiant=" + identifiant + ", nom=" + nom +
				", tarifKm=" + tarifKm + "]");
	}



	public Livreur getResponsable() {
		return responsable;
	}



	public void setResponsable(Livreur responsable) {
		if(this.responsable ==responsable) return ;
		this.responsable = responsable;
		
	}



	



	
	
	
	



	
	
}
