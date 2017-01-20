package principal;

import Exception.ExceptionType;

public abstract class UniteComp <E extends Unite, T extends Unite > extends Unite {
	
	
	    private E dividant;
	    private T diviseur;
	    
	    public E getdividant(){
	    	return dividant;
	    }
	    public T getdiviseur(){
	    	return diviseur;
	    }
		public UniteComp(String nom, String abreviations, E dividant,T diviseur) {
			super(nom, abreviations);
			this.dividant=dividant;
			this.diviseur=diviseur;
			this.diviseur.setamount(1);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public double getamount(){
			
			return dividant.getamount()/diviseur.getamount();
		}
		public void setamount(double D){
			dividant.setamount(D);
			diviseur.setamount(1);
		}
		
		public static  void  Converetion(UniteComp from, UniteComp to) throws ExceptionType {
			Unite.Converetion(from.dividant, to.dividant);
			Unite.Converetion(from.diviseur, to.diviseur);
			
		}

	}



