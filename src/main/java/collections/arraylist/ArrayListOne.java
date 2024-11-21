package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListOne {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);

        list1.add(2,25);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        list1.set(2,100);
        System.out.println(list1);

        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("2nd");
        ListIterator<Integer> lt = list1.listIterator(list1.size());
       // ListIterator<Integer> lt = list1.listIterator();
//      while(lt.hasNext())
//        {
//            System.out.println(lt.next());
//        }

        System.out.println("reverse");
        while(lt.hasPrevious())
        {
            System.out.println(lt.previous());
        }



    }
}
