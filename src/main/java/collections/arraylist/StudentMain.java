package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {
        Student s1= new Student(101, "Arsh", "Brampton");
        Student s2= new Student(102, "Savi", "Brampton");

        Student s3= new Student(103, "Nader", "Brampton");

        Student s4= new Student(104, "Satvir", "Brampton");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.print(list.toString());




    }
}
