package src.com.java8.examples.defaultandstaticinterfacemethods;

public class DefaultStaticInterfaceMethodsDemo implements interface1 , interface2{
    @Override
    public void method1() {
        System.out.println("overriding SAM method1 in interface1...");
    }

    @Override
    public void log(String str) {
        System.out.println("log >>" +str);
    }

    @Override
    public void method2() {
        System.out.println("Overriding SAM in interface2");
    }

    public static void main (String args []) {

        DefaultStaticInterfaceMethodsDemo demo = new DefaultStaticInterfaceMethodsDemo();
        demo.method1();
        demo.log("test default");
        interface1.print1("test static ..");
        demo.log("test default");

    }


}
