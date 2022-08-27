

//Sini's code
 import java.util.HashMap;

public class TestMap 
{	
	public static HashMap<String,Integer> buildMap(String s)
	{
		HashMap<String,Integer> hm=new HashMap<>();
				
		while(s.length()>0)
		{
			int a=s.indexOf(':');
			String state=s.substring(0,a);
			if(state.length()>3)
			{
				state=state.substring(0,3);
			}
		
			int b=s.indexOf('-');
			
			int count;
			if (b>0)
			{
				count=Integer.parseInt(s.substring(a+1,b));
			}
			else
			{
				count=Integer.parseInt(s.substring(a+1));
				hm.put(state,count);
				break;
			}
			
			hm.put(state,count);	
			
			s=s.substring(b+1);
		
		}
		return hm;
	}
	
	public static void main(String args[])
	{
		String s="Maharashtra:12-Karnataka:10-UP:25-Goa:5";
		System.out.println(buildMap(s));
	}

}
