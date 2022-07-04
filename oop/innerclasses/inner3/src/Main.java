public class Main {
    public static void main(String[] args) {
        MyClass.Inner inner=new MyClass().new Inner();
        inner.methodFromBase();
        inner.methodFromInner();
    }
}
