//Kratika's code , character count 

import java.util.*;
public class Assignment2 {
	
	static void characterCount(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		
		char[] strArray=str.toCharArray();
		
		for(char c:strArray) {
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
				
			}
			else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry entry:hm.entrySet()) {
			
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
	}

	public static void main(String[] args) {
		
		
		String str="Kratika";
		characterCount(str);

	}

}

