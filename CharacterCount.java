//Deepanjali's code


import java.io.*;
import java.util.*;

        public class CharacterCount {

        public static void characterCount(String inputString) {

        HashMap<Character, Integer> charCountMap=new HashMap<Character, Integer>();

        char[] charArray= inputString.toCharArray();

        for(char ch: charArray) {
        if (charCountMap.containsKey(ch)) {

        charCountMap.put(ch, charCountMap.get(ch) + 1);
     }

             else {
	charCountMap.put(ch, 1);
    }
    }

        System.out.println(charCountMap);
    }

        public static void main(String args[]) {
	String str = "Thisisasample";

	characterCount(str);

  }
}


