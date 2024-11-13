package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;

	public Sanglier(Gaulois chasseur, int poids) {
		super("Sanglier", Unité.KILOGRAMME);
		this.chasseur = chasseur;
		this.poids = poids;
	}

	@Override
	public String decrireProduit() {
		return "sanglier de " + poids + "kg chassé par " + chasseur.getNom();
	}
}
