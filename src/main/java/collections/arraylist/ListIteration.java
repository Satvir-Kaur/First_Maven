package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        int size = list.size();
        System.out.println(size);

        System.out.println("Using Iterator");

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("Using List Iterator");
        ListIterator<Integer> ltr= list.listIterator();
        while(ltr.hasNext())
        {
            System.out.print((ltr.next() + " "));
        }

        System.out.println();
        System.out.println("Basckward using List Iterator");

        while(ltr.hasPrevious())
        {
            System.out.print(ltr.previous() +" ");
        }
        System.out.println();
        System.out.println("Using For Each Loop");
        for(int i:list)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Using For loop");

    }


}
