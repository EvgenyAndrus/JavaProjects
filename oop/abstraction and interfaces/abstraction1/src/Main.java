abstract class AbstractionClass{
    public abstract void method();
}

class ConcreteClass extends AbstractionClass{
       public void method() {
        System.out.println("Implementation");
    }
}
public class Main {
    public static void main(String[] args) {
        AbstractionClass instance=new ConcreteClass();
        instance.method();
    }
}
