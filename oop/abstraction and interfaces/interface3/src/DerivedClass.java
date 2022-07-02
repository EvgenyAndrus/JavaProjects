public class DerivedClass extends BaseClass implements Interface1,Interface2{

    @Override
    public void method1() {
        System.out.println("method1 -> interface1");
    }

    @Override
    public void method2() {
        System.out.println("method2 -> interface2");
    }
}
