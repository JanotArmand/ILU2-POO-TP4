package produit;

public abstract class Produit {
	private String nom;
	private Unité unité;

	protected Produit(String nom, Unité unité) {
		this.nom = nom;
		this.unité = unité;
	}

	public String getNom() {
		return nom;
	}

	public abstract String decrireProduit();
}
