
//Sini's code
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


       public class TestPlayers {
	
       public static String checkPlayerList(HashMap<String,ArrayList<String>> hm,String name) {
            
              int count=0;
		
		 for(int i=0;i<1;i++) {
				
       Collection<ArrayList<String>> collection=hm.values();
                 
                 for(ArrayList<String> col:collection) {
		 if(col.contains(name)) {
		 count++;
				}

			}
		}
		if(count>1) {
	        return name+" applied for multiple games";
		}
		else if(count==1) {
                return name+" applied for single games";
		}
		else {
		return name+" not applied for any games";	
		}
		
	}
	
	public static void main(String args[])
	{
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
               
         ArrayList<String> ar= new ArrayList<>();
		ar.add("Klaus");
		ar.add("Elijah");
		ar.add("Rebekah");
		
		hm.put("Badminton",ar);
		
         ArrayList<String> ar1= new ArrayList<>();
		ar1.add("Finn");		
                ar1.add("Kol");		
                ar1.add("Freya");		
                ar1.add("Vincent");
		
                hm.put("Cricket",ar1);
				
         ArrayList<String> ar2= new ArrayList<>();
		ar2.add("Camille");
		ar2.add("Hope");
		ar2.add("Hayley");
		ar2.add("Davina");
		
		hm.put("Football",ar2);
		
        ArrayList<String> ar3= new ArrayList<>();
		ar3.add("Josh");
		ar3.add("Aurora");
		ar3.add("Tatia");
				
                hm.put("Hockey",ar3);
		
       System.out.println(hm);
       System.out.println(checkPlayerList(hm,"Kol"));
       System.out.println(checkPlayerList(hm,"Elijah"));
       System.out.println(checkPlayerList(hm,"Hope"));
		
	}

}
