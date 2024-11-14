package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @AllArgsConstructor
    @Data

   public static class Student{
       private int id;
        String name;
        String address;




   }
}
