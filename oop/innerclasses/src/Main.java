public class Main {

    public static void main(String[] args) {
        MyClass.Nested.staticMethodNested();
        MyClass.Nested nested=new MyClass.Nested();
        nested.say();
        new MyClass.Nested().say();
        MyClass.method11();
    }
}
