package principal;

public class UniteTempsRelative extends UniteTemps{
	
	public UniteTempsRelative(String nom, String abreviation, double coeff,UniteTemps unit){
		
		this.setNom(nom);
		this.setAbreviations(abreviation);
		this.setCoeff(coeff);
		this.setRef(unit);

		}


}
