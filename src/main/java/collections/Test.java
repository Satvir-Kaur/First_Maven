package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> l= new ArrayList<Integer>();
        LinkedList<Integer> linkedlist= new LinkedList<>();
        System.out.println(linkedlist);
        linkedlist.add(0, 10);
        System.out.println(linkedlist);
         /* linkedlist.add(1, 30);
      System.out.println(linkedlist);
        linkedlist.add(10);
        System.out.println(linkedlist); */
        int size = linkedlist.size();
        System.out.println(size);
        int size1 = l.size();
        System.out.println(size1);
        l.add(100);

        //int size2 = l.size();
        //System.out.println(size2);
        l.add(200);
        l.add(300);
        System.out.println(l);
        l.add(2,500);
        System.out.println(l);


    }
}
