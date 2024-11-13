package produit;

public enum Unité {
	LITRE("l"), GRAMME("g"), KILOGRAMME("kg"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("pièce");

	private String nom;

	private Unité(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

}
