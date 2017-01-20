package principal;

public class UniteTemps extends Unite {
	   /** L'i */
 private static UniteTemps seconde;
	  
	    public static UniteTemps getInstance() {
	        if (null == seconde) { 
	            seconde = new UniteTemps();
	        }
	        return seconde;
	    }

	   
	    public UniteTemps() {	
	    	super("Seconde","S");
	    }
	    /*public UniteTemps(String nom, String abreviations) {
			super(nom,abreviations);
		}*/
		


}
