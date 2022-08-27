//Hymawathi code
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestPlayers
{
	public static String checkPlayerList(HashMap<String,ArrayList<String>> hm,String name)
	{
		int count=0;
		
		for(int i=0;i<1;i++)
		{
			//Collection<ArrayList<String>> collection=hm.values();
			Collection<ArrayList<String>> collection=hm.values();
			for(ArrayList<String> col:collection)
			{
				if(col.contains(name))
				{
					count++;
				}

			}
		}
		if(count>1)
		{
			return name+" applied for multiple games";
		}
		else if(count==1)
		{
			return name+" applied for single games";
		}
		else
		{
			return name+" not applied for any games";	
		}
		
	}
	
	public static void main(String args[])
	{
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
		
		ArrayList<String> ar= new ArrayList<>();
		ar.add("Suhasini");
		ar.add("sangita");
		ar.add("sanu");
		
		hm.put("Badminton",ar);
		
		ArrayList<String> ar1= new ArrayList<>();
		ar1.add("Rohit");
		ar1.add("rahul");
		ar1.add("prasad");
		ar1.add("Riya");
		
		hm.put("Cricket",ar1);
		
		ArrayList<String> ar2= new ArrayList<>();
		ar2.add("Manish");
		ar2.add("kanha");
		ar2.add("aarab");
		ar2.add("Sachin");
		
		hm.put("Football",ar2);
		
		ArrayList<String> ar3= new ArrayList<>();
		ar3.add("Archit");
		ar3.add("Samyak");
		ar3.add("Sourabh");
		
		hm.put("Hockey",ar3);
		
		System.out.println(hm);
		
		System.out.println(checkPlayerList(hm,"Suhasini"));
		System.out.println(checkPlayerList(hm,"prasad"));
		System.out.println(checkPlayerList(hm,"Priya"));
		
	}
}
