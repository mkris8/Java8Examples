package src.com.java8.examples.defaultstatic;

public class DefaultAndStaticMethodsDemo implements interface1, interface2{

    @Override
    public  void method1() {
        System.out.println("overriding method1 from interface1");
    }

    @Override
    public void method2(){
        System.out.println("overriding method2 from interface2");
    }


    public static void main (String args []) {
        DefaultAndStaticMethodsDemo demo = new DefaultAndStaticMethodsDemo();
        demo.method1();
        demo.method2();
        //calling default method
        demo.defaultMethod1();
        //calling static method
        interface1.staticMethod();

    }


}
