public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.methodFromBase();
        //myClass.methodFromInner();

        MyClass.Inner inner=new MyClass().new Inner();
        //inner.methodFromBase();
        inner.methodFromInner();
    }
}
