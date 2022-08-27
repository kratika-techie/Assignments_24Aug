




//Deepanjali's code
import java.util.*;

public class TestMap{
 public static HashMap<String, Integer> buildMap(String s){
   HashMap<String, Integer> hp=new HashMap<String, Integer>();
    while (s.length()>0){
     int i=s.indexOf(':');
     String st=s.substring(0,i);
      if(st.length()>3){
       st=st.substring(0,3);
        }
      int j=s.indexOf('-');
       int count;
        if(j>0){
         count=Integer.parseInt(s.substring(i+1, j));
          }
          else{
          count=Integer.parseInt(s.substring(i+1));
           hp.put(st,count);
           break;
          } 
          hp.put(st, count);
          s=s.substring(j+1);
        }
        return hp;
       }
public static void main(String args[]){
    String s="Maharashtra:12-Karnataka:10-UP:25-Goa:5";
     System.out.println(buildMap(s));
   }
 }

