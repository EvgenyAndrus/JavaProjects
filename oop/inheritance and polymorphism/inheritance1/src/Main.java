public class Main {
    public static void main(String[] args) {
        DerivedClass instance=new DerivedClass();
        instance.field1=1;
        instance.field2=2;
        instance.field3=3;

        instance.field4=4;
        instance.field5=5;

        BaseClass newInsance=(BaseClass) instance; // Upcast
        System.out.println(newInsance.field1);
        System.out.println(newInsance.field2);
        System.out.println(newInsance.field3);

        System.out.println("instance Id:    "+instance.hashCode());
        System.out.println("newIstance Id:  "+newInsance.hashCode());
    }
}
