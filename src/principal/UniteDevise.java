package principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UniteDevise extends Unite {
	
	   /** L'i */
	//private static  List <devise> list =new ArrayList <devise>();
	
	  private static UniteDevise dollar;
	    
	  

			public static UniteDevise getInstance() {
		        if (null == dollar) { 
		            dollar = new UniteDevise();
		        }
		        return dollar;
		    }

		   
		    public UniteDevise() {	
		    	super("Dollar","$");
		    	
		    }

		
		


		
	    

 
}
