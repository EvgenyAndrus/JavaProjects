public class Main {
    public static void main(String[] args) {
        DerivedClass derivedClass=new DerivedClass();
        derivedClass.method();
        derivedClass.method1();
        derivedClass.method2();

        System.out.println("-------------------------------------------");

        BaseClass b=(BaseClass) derivedClass;
        b.method();

        Interface1 i1=(Interface1) derivedClass;
        i1.method1();

        Interface2 i2=(Interface2) derivedClass;
        i2.method2();
    }
}
