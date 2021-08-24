package src.com.java8.examples.lambdas;

//Before Java 8, option 1 :use a runnable interface
class MyRunnable1 implements Runnable{

    @Override
    public void run () {
        System.out.println("Running >>" +Thread.currentThread().getName());
    }

}

public class RunnableDemo {

    public static void main(String [] args) {
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread t1 = new Thread(myRunnable1);
        t1.start();

        //Before Java 8, option 2 : pass an anonymous class to the thread's constructor
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running >>" +Thread.currentThread().getName());
            }
        });

        t2.start();

        //Java 8, use Lambda Runnable
      /*  Runnable r = () -> { System.out.println("running lambda runnable" +Thread.currentThread().getName()); };
        new Thread(r).start();
*/



    }

}
