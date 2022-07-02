abstract class AbstractionClassA{
    public abstract void methodA();
}
abstract class AbstractionClassB extends AbstractionClassA{
    public abstract void methodB();
}

class ConcreteClass extends AbstractionClassB{
    @Override
    public void methodA() {
        System.out.println("ConcreteClass.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteClass.methodB");
    }
}
public class Main {
    public static void main(String[] args) {
        AbstractionClassA instance=new ConcreteClass();
        instance.methodA();

        ((AbstractionClassB)instance).methodB();
    }
}
