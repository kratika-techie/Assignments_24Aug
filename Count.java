import java.util.*;

public class Count{
 
 public static void main(String args[]){
   String str="This is a sample";
   Map<String,Long> result= Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,xCollectors.counting()));
   System.out.println(result);
  }
} 