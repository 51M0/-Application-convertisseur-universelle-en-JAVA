package principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UniteDistance extends Unite {
	
	  
	
    private static UniteDistance Metre;
    
	  

		public static UniteDistance getInstance() {
	        if (null == Metre) { 
	            Metre = new UniteDistance();
	        }
	        return Metre;
	    }

	   
	    public UniteDistance() {	
	    	super("metre","M");
	    	
	    }
	   /* public UniteDistance(String nom, String abreviations,double coeff, UniteDistance ref) {
			super(nom,abreviations);
			this.coeff=coeff;
			this.ref=ref;
		}


		public static List<UniteDistance> getList() {
			return list;
		}*/
		/*public void Convertir1(UniteDistance u){
			UniteDistance actuelle =this;
			LinkedList <UniteDistance> nouvelle= new LinkedList<UniteDistance>() ;
			for (UniteDistance D: this.getList()){
				if (D.getRef()==u){
					nouvelle.add(D)	;		}
			}}*/
			/*public void convertir(UniteDistance unite){
	UniteDistance chercher=this.ref;	
	double  total=this.coeff;
		while (chercher!=unite){
			total*=chercher.getCoeff();
			chercher=chercher.getRef();
		}
		this.setamount(chercher.getamount()*total);

	}
			public static void ConvertirMap(Map<String,UniteDistance>m,String from,String to){
				m.get(to).convertir(m.get(from));
				
			}

		*/
		


		
	    

 
}
