public class Main {
    public static void main(String[] args) {
        DerivedClass instance=new DerivedClass();
        instance.method();

        //UpCast
        BaseClass instanceUp=instance;
        instanceUp.method();

        //DownCast
        DerivedClass instanceDown=instance;
        instanceDown.method();
    }
}
