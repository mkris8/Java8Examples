package src.com.java8.examples;

import java.util.stream.IntStream;

public class SimpleForLoop {

    public static void main(String[] args) {
        // simple for
        /*for(int i = 0 ; i < 3 ;i ++){
            System.out.println("test ...");
        }*/

        /*IntStream class is an specialization of Stream interface for int primitive*/

        // IntStream forEach Example
        IntStream.range(0,3).forEach(SimpleForLoop :: doSomething);
        System.out.println("----------------------");

        // Example 2
        IntStream stream1 = IntStream.range(1, 10);
        stream1.forEach(System.out::println);

        System.out.println("----------------------");
        IntStream stream2 = IntStream.rangeClosed(5 , 11);
        stream2.forEach(System.out::println);

        System.out.println("----------------------");
        IntStream stream3 = IntStream.of(101);
        stream3.forEach(System.out::println);

        System.out.println("----------------------");
        IntStream stream4 = IntStream.of(10 , 20 , 30);
        stream4.forEach(System.out::println);
    }

    private static void doSomething(int i) {
        System.out.println("test ...");
    }

}
