package principal;

public class UniteDeviseRelative extends UniteDevise {
	public UniteDeviseRelative(String nom, String abreviation, double coeff,UniteDevise unit){
		
		this.setNom(nom);
		this.setAbreviations(abreviation);
		this.setCoeff(coeff);
		this.setRef(unit);

		}

}
