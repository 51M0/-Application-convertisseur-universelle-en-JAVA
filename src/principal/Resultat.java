package principal;

public class Resultat {
	private double resultat;
	private String nomClasse;
	public Resultat(double resultat, String nomClasse) {
		this.resultat = resultat;
		this.nomClasse = nomClasse;
	}
	public double getResultat() {
		return resultat;
	}
	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

}
