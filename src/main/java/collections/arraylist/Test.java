package collections.arraylist;



import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(10,43,53,423,34,542,423,10,2535,23,234,32,23,53,5643);

         Set<Integer> set= new HashSet<>();
         set.addAll(list);
        System.out.println(set);
    }
}
