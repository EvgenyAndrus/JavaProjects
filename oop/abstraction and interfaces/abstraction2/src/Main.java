class ConcreteClassA {
    public void operation() {
        System.out.println("ConcreteClassA.operation");
    }
}

abstract class AbstractionClass extends ConcreteClassA{
    public abstract void method();
}

class ConcreteClassB extends AbstractionClass{
    public void method() {
        System.out.println("Implementation");
    }
}
public class Main {
    public static void main(String[] args) {
        AbstractionClass instance=new ConcreteClassB();
        instance.method();
        instance.operation();
    }
}
