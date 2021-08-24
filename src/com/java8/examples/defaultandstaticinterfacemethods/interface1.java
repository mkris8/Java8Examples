package src.com.java8.examples.defaultandstaticinterfacemethods;

@FunctionalInterface
public interface interface1 {

    void method1(); // single abstract method in the functional interface

    //default method with pre-defined method body
    default void log(String str) {
        System.out.println("log interface1 >>" +str);
    }

    //static method. Cannot override, can be accessed with interface name
    static void print1 (String str) {
        System.out.println("print1 >>" +str);
    }
}
