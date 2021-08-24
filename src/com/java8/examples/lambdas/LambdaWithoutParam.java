package src.com.java8.examples.lambdas;

@FunctionalInterface
interface MyFunctionalInterface {
    public String sayHello();
}

public class LambdaWithoutParam {
    public static void main(String[] args) {

        MyFunctionalInterface msg = () -> { return "Hello" ; };
        System.out.println(msg.sayHello());
    }

}
