package produit;

public class Sanglier extends Produit {
	private int poids;
	private String chasseur;
	
	public Sanglier(int poids, String chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public String decrireProduit() {
		return getNom() + " de " + poids + " " + unite.getNom() + " chassé par " + chasseur;
	}

}
