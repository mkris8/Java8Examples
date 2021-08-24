package src.com.java8.examples.lambdas;

@FunctionalInterface
interface HelloWorldInterface {
    public void call();
}

public class LambdaHelloWorld {

    public static void main(String[] args) {
        HelloWorldInterface msg = () -> {System.out.println("Hello World");};
        msg.call();
    }
}
