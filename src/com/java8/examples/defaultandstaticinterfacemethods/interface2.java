package src.com.java8.examples.defaultandstaticinterfacemethods;
@FunctionalInterface
public interface interface2 {

    void method2(); // SAM

    //default
    default void log (String str) {
        System.out.println("log1 in interface2 >>" + str);
    }

}
