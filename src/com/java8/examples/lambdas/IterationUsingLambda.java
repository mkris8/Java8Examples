package src.com.java8.examples.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IterationUsingLambda {

    public static void main(String[] args) {

        List <Integer> myList = new ArrayList<Integer>();
        for (int i = 0 ; i < 10 ; i ++) myList.add(i);

        //Iterate using lambda
        myList.forEach((n) -> System.out.println(n));

        // Consumer and lambda
        Consumer<Integer> consumer = (n) -> {System.out.println(n);};
        myList.forEach(consumer);



    }
}
