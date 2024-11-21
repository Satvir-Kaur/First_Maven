package collections;

public class GenericsDemoMain {
    public static void main(String[] args) {
        GenericsDemo<String, String, Integer> d= new GenericsDemo<>("Savi", "SAvi@gmail.com", 101);

        System.out.println(d.toString());
    }
}
