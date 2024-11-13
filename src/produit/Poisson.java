package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String datePeche) {
		super("poisson", Unité.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public String decrireProduit() {
		return "poisson pêché" + datePeche;
	}
}
