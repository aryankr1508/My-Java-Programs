import java.util.stream.*;
public class Stream1 
{
     public static void main(String[] args)
     {
         List<Integer> list = new ArrayList<Integer>();
 
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 
         Stream<Integer> stream = list.stream();
         stream.forEach(p -> System.out.println(p));
     }
}