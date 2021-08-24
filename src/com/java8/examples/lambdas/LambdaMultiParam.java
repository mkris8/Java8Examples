package src.com.java8.examples.lambdas;

@FunctionalInterface
interface LambdaMultiParamInterface {
    public String strConcat(String a, String b);
}

public class LambdaMultiParam {
    public static void main(String[] args) {

        LambdaMultiParamInterface msg = (a , b) -> a + b;
        System.out.println(msg.strConcat("Hello", "World"));
    }
}
