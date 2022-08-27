//Kratika's Code , Test player 

import java.util.*;

public class Assignment1 {
	public static String checkPlayerList(HashMap<String, ArrayList<String>> hm, String name) {
		int count = 0;

		for (int i = 0; i < 1; i++) {

			Collection<ArrayList<String>> collection = hm.values();
			for (ArrayList<String> cl : collection) {
				if (cl.contains(name)) {
					count++;
				}

			}
		}
		if (count > 1) {
			return name + " applied for multiple games";
		} else if (count == 1) {
			return name + " applied for single games";
		} else {
			return name + " not applied for any games";
		}

	}

	public static void main(String args[]) {
		HashMap<String, ArrayList<String>> hm = new HashMap<>();

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Kushagra");
		a1.add("Yashi");
		a1.add("Rohan");

		hm.put("Tennis", a1);

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("Aman");
		a2.add("Aditya");
		a2.add("Rati");
		a2.add("Azad");
		hm.put("Paragliding", a2);

		ArrayList<String> a3 = new ArrayList<>();
		a3.add("Manjul");
		a3.add("Rahul");
		a3.add("Saumyak");
		a3.add("Sanskar");
		hm.put("Cricket", a3);

		ArrayList<String> a4 = new ArrayList<>();
		a4.add("Saumya");
		a4.add("Shashank");
		a4.add("Ankit");
		hm.put("Shooting", a4);

		System.out.println(hm);
		System.out.println(checkPlayerList(hm, "Shashank"));
		System.out.println(checkPlayerList(hm, "Azad"));
		System.out.println(checkPlayerList(hm, "KManjul"));

	}
}
