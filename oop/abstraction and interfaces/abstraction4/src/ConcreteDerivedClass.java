public class ConcreteDerivedClass extends AbstractBaseClass{
    public void baseOverriddenMethod(){
        super.overriddenMethod();
    }
    @Override
    public void overriddenMethod(){
        System.out.println("DerivedClass.overriddenMethod");
    }

    @Override
    public void abstractMethod() {
        System.out.println("DerivedClass.abstractMethod");
    }
}
