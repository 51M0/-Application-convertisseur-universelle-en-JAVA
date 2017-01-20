package principal;
import Exception.ExceptionType;
public abstract class Unite {
	private String nom;
	private String abreviations;
	private double amount=0;
	private Unite ref; 
    private double coeff=1;
	public double getamount() {
		return amount;
	}
	public void setamount(double amount) {
		this.amount = amount;} 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAbreviations() {
		return abreviations;
	}
	public void setAbreviations(String abreviations) {
		this.abreviations = abreviations;
	}
	public Unite(String nom, String abreviations) {
		this.nom = nom;
		this.abreviations = abreviations;
	}
	public Unite getRef() {
		return ref;
	}
	public void setRef(Unite ref) {
		this.ref = ref;
	}
	public double getCoeff() {
		return coeff;
	}
	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}
	public static Resultat recupval(Unite p){
		if(p.ref==null){
			return new Resultat (1,p.getNom());
		}
		Resultat r=recupval(p.ref);
		r.setResultat(r.getResultat()*p.coeff);
		return r;
	}
	public static void  Converetion(Unite from, Unite to) throws ExceptionType {
		Resultat ra=recupval( from)	;
		Resultat rb=recupval(to);
		if (!ra.getNomClasse().equals(rb.getNomClasse()))
			throw new ExceptionType();
		Double coef=ra.getResultat()/rb.getResultat();
		to.setamount(from.getamount()*coef);	
	}
}
