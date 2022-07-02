public class Main {
    public static void main(String[] args) {
        Interface1 interface1=new DerivedClass();
        Interface2 interface2=new DerivedClass();

        interface1.method1();
        //interface1.method2();

        //interface2.method1();
        interface2.method2();

        ((DerivedClass)interface1).method2();
        ((DerivedClass)interface2).method1();

    }
}
