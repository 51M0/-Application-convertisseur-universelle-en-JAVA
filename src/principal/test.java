package principal;

import java.util.Map;
import principal.LoadF;

public class test {

	/*public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UniteDistance metre=UniteDistance.getInstance();
		UniteDevise devise=UniteDevise.getInstance();		
		UniteDistanceRelative feet=new UniteDistanceRelative("feet","F",1.5,metre);
		UniteDistanceRelative inche=new UniteDistanceRelative("inche","inch",5,feet);
		UniteDistanceRelative pouce=new UniteDistanceRelative("pouce","p",40,feet);
		metre.setamount(5);
		feet.setamount(10);
		UniteTemps seconde=UniteTemps.getInstance();
		seconde.setamount(10);
		
		//System.out.println(pouce.getamount());
		Map<String,UniteDistance> Distance= LoadF.LoadDistance();
		Distance.get("M").setamount(5);
		
		Map<String,UniteTemps>T= LoadF.LoadTemps();
		Map<String,UniteDevise>Devise= LoadF.LoadDevise();
		Devise.get("$").setamount(1);
		T.get("H").setamount(1);
		//System.out.print(T.get("H").getamount());
		Unite.Converetion(T.get("H"),T.get("S"));
		System.out.println(T.get("S").getamount());
		Unite.Converetion(Devise.get("$"), Devise.get("€"));
		System.out.println(Devise.get("€").getamount());
        
		Distance.get("M").setamount(5);
		System.out.println(Distance.get("M").getamount());
		System.out.println(Distance.get("M").getNom());
		Unite.Converetion(Distance.get("M"),Distance.get("cm"));
		System.out.println(Unite.recupval(Distance.get("cm")).getNomClasse());
		
		
		UniteVitesse ms= new UniteVitesse("metre/seconde","m/s",Distance.get("M"),T.get("S"));
		ms.setamount(1);
		UniteVitesse kmh= new UniteVitesse("km/h","km/h",Distance.get("km"),T.get("H"));
		UniteComp.Converetion(ms, kmh);
		System.out.println(kmh.getamount());
		UniteVitesse unitVfrom=new UniteVitesse(Distance.get("M").getNom()+"/"+T.get("S").getNom(), "metre"+"/"+"secode",Distance.get("M"), T.get("S"));
		UniteVitesse unitVto=new UniteVitesse(Distance.get("km").getNom()+"/"+T.get("H").getNom(), "km"+"/"+"h",Distance.get("km"), T.get("H"));
		UniteComp.Converetion(unitVfrom, unitVto);
		System.out.println(unitVto.getamount());
		
        
		
       
       
	}*/

}
