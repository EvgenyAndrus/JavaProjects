class MyClass {
    public <T> void method(T argument) {
        T variable = argument;

        System.out.println(variable);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.method("Hello world!");
        instance.method(123);
        instance.method(123.66);
        instance.method(new MyClass());
        instance.method(instance);
    }
}