interface Interface1{
    void method1();
}
interface Interface2 extends Interface1{
    void method2();
}

class ConcreteClass implements Interface2{
    @Override
    public void method1(){
        System.out.println("method1 -> Interface1");
    }

    @Override
    public void method2() {
        System.out.println("method2 -> Interface2");
    }
}
public class Main {
    public static void main(String[] args) {
        ConcreteClass concreteClass=new ConcreteClass();
        concreteClass.method1();
        concreteClass.method2();

        Interface1 interface1=concreteClass;
        interface1.method1();

        Interface2 interface2=concreteClass;
        interface2.method1();
        interface2.method2();
    }
}
