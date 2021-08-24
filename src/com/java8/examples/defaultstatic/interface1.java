package src.com.java8.examples.defaultstatic;

@FunctionalInterface
public interface interface1 {

    void method1();

    //default method with pre-defined body
    public default void defaultMethod1 () {
        System.out.println("called defaultMethod1 ...");
    }

    //static method that can be invoked with interface name and cannot be overridden
    public static void staticMethod() {
        System.out.println("Called static method1...");
    }

}
