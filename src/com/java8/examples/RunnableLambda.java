package src.com.java8.examples;

public class RunnableLambda {

    public static void main(String[] args) throws InterruptedException {

        // Normal runnable
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0 ; i <3 ; i++) {
                    System.out.println("running :" + Thread.currentThread().getName());
                }
            }
        };*/

        // Runnable as a lamdba expression
        Runnable runnableLambda = () -> {

            for (int i = 0 ; i <3 ; i++) {
                System.out.println("running :" + Thread.currentThread().getName());
            }
        };

//        Thread thread = new Thread(runnable);
        Thread thread = new Thread(runnableLambda);
        thread.start();
        thread.join();

    }
}
