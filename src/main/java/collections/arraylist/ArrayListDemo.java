package collections.arraylist;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        List<Integer> list= new ArrayList<>(5);
        int size = list.size();
        System.out.println(size);

        List<Integer> list1= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(100);
        list.add(50);
        list.add(75);
        list.add(45);
        list.add(5);

       // list.add(,30);
        list1.add(30);
        list1.add(40);
        System.out.println(list);
        list.addAll(list1);
        System.out.println(list);
        list.addAll(1, list1);
        System.out.println(list);
        boolean b = list.contains(10);
        System.out.println(b);
        boolean b1 = list.containsAll(list1);
        System.out.println(b1);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");

        Iterator<Integer> iterator1 = list.stream().iterator();
        while(iterator1.hasNext())
        {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();
        ListIterator<Integer> integerListIterator = list.listIterator();
        System.out.println(integerListIterator);

        Collections.sort(list);
        System.out.println(list);

        for(Integer i: list)
        {
            System.out.print(i + " ");
        }

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);




        //list.clear();
        //System.out.println(list);
        /*int size = list.size();
        System.out.println(size);
        String string = list.toString();
        System.out.println(string);*/



    }
}
