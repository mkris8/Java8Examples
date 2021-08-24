package src.com.java8.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String args []) {

        // create a sample collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0 ; i < 10 ; i ++) { myList.add(i); }

        //java 7 - simple for
        System.out.println("java 7 - simple for ...");
        for (int i = 0 ; i < 10 ; i ++) {
            System.out.println(myList.get(i));
        }
        //java 7 - iterator
        System.out.println("java 7 - iterator ...");
        Iterator iter = myList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        //java 8 using Consumer (using implementation of Pre-defined functional interface)
        System.out.println("java 8 using Consumer ...");
        MyConsumer myConsumer = new MyConsumer();
        myList.forEach(myConsumer);

        // java 8 using Consumer using Consumer as an anonymous class
        System.out.println("java 8 using Consumer , anon class...");
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });


    }

}

class MyConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
