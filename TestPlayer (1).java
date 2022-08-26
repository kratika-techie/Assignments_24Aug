import java.util.*;

public class TestPlayer{
 public static String checkPlayerList(HashMap<String,ArrayList<String>>hp, String name){
    int count=0;
     for(int i=0; i<1; i++){
      Collection<ArrayList<String>> collection=hp.values();
        for(ArrayList<String> col:collection){
            if(col.contains(name)){
              count++;
              }
             }
            }
            if(count>1){
              return name+"applied for single games";
              }
              else{
              return name+"not applies for any games";
              }
         }
  public static void main(String args[]){
    HashMap<String, ArrayList<String>> hp=new HashMap<>();
    ArrayList<String> al=new ArrayList<>();
      al.add("Pavan");
      al.add("Saritha");
      al.add("Siva");
      hp.put("Kho-Kho",al);

    
    ArrayList<String> al1=new ArrayList<>();
      al1.add("Bhavani");
      al1.add("Teja");
      al1.add("Prasanna");
      hp.put("Kabaddi", al1);

    ArrayList<String> al2=new ArrayList<>();
      al2.add("Sai");
      al2.add("Prasad");
      al2.add("Nithin");
      hp.put("Cricket", al2);

   ArrayList<String> al3=new ArrayList<>();
      al3.add("Hemanth");
      al3.add("Tyson");
      al3.add("Raghu");
      hp.put("Volleyball", al3);

    System.out.println(hp);
    System.out.println(checkPlayerList(hp,"Raghu"));
    System.out.println(checkPlayerList(hp,"Prasanna"));
    System.out.println(checkPlayerList(hp,"Prasad"));
  }
 }