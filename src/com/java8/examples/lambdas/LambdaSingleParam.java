package src.com.java8.examples.lambdas;

@FunctionalInterface
interface SingleParamInterface {
    public int incrementByFive(int a);
}

public class LambdaSingleParam {

    public static void main(String[] args) {

        SingleParamInterface msg = (n) ->  n + 5 ;
        System.out.println(msg.incrementByFive(10));
    }


}
