package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {

	public static void acheterProduit(IEtal[] marche, String produit, int quantiteSouhaitee) {
		int quantiteRestante = quantiteSouhaitee;
		for (int i = 0; i < marche.length && quantiteRestante != 0; i++) {
			IEtal etal = marche[i];
			int quantiteDisponible = etal.contientProduit(produit, quantiteRestante);
			if (quantiteDisponible != 0) {
				int prix = etal.acheterProduit(quantiteDisponible);
				String chaineProduit = accorderNomProduit(produit, quantiteDisponible);
				System.out.println("A l'étal n° " + (i + 1) + ", j'achete " + quantiteDisponible + " " + chaineProduit
						+ " et je paye " + prix + " sous.");
				quantiteRestante -= quantiteDisponible;
			}
		}
		String chaineProduit = accorderNomProduit(produit, quantiteSouhaitee);
		System.out.println("Je voulais " + quantiteSouhaitee + " " + chaineProduit + ", j'en ai acheté "
				+ (quantiteSouhaitee - quantiteRestante) + ".");
	}

	private static String accorderNomProduit(String produit, int quantiteSouhaitee) {
		String chaineProduit = produit;
		if (quantiteSouhaitee > 1) {
			chaineProduit = produit + "s";
		}
		return chaineProduit;
	}

	public static void main(String[] args) {
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);
	}

}
