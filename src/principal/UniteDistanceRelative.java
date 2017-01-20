package principal;

public class UniteDistanceRelative extends UniteDistance{
	

public UniteDistanceRelative(String nom, String abreviation, double coeff,UniteDistance unit){
	
this.setNom(nom);
this.setAbreviations(abreviation);
this.setCoeff(coeff);
this.setRef(unit);

}


}
