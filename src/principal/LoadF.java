package principal;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class LoadF {
	  
	
	 
	 public static Map<String,UniteDistance> LoadDistance()throws Exception {
		 File f=new File("distance.txt");
		 Scanner S1=new Scanner(f);
     	 Map<String, UniteDistance> M = new HashMap<>();
     	 M.put("M", UniteDistance.getInstance());
     	 while(S1.hasNextLine()){
     		 String name=S1.next();
     		 String abrev=S1.next();
     		 double val= Double.parseDouble(S1.next());
     		 String ref=S1.next();
     		 M.put(abrev, new UniteDistanceRelative(name,abrev,val,M.get(ref)));
     	 }
     	 return M;
     
     	
     }
	 public static Map<String,UniteDevise> LoadDevise()throws Exception {
		 File f=new File("devise.txt");
		 Scanner S1=new Scanner(f);
     	 Map<String, UniteDevise> M = new HashMap<>();
     	 M.put("$", UniteDevise.getInstance());
     	 while(S1.hasNextLine()){
     		 String name=S1.next();
     		 String abrev=S1.next();
     		 double val= Double.parseDouble(S1.next());
     		 String ref=S1.next();
     		 M.put(abrev, new UniteDeviseRelative(name,abrev,val,M.get(ref)));
     		
     		 
     	 }
     	 return M;
     
     	
     }
	 public static Map<String,UniteTemps> LoadTemps()throws Exception {
		 File f=new File("temps.txt");
		 Scanner S1=new Scanner(f);
     	 Map<String, UniteTemps> M = new HashMap<>();
     	 M.put("S", UniteTemps.getInstance());
     	 while(S1.hasNextLine()){
     		 String name=S1.next();
     		 String abrev=S1.next();
     		 double val= Double.parseDouble(S1.next());
     		 String ref=S1.next();
     		 M.put(abrev, new UniteTempsRelative(name,abrev,val,M.get(ref)));
     		
     		 
     	 }
     	 return M;
     
     	
     }
	 
}
