public class Main {
    public static void main(String[] args) {
        DerivedClass instans=new DerivedClass();
        instans.method();

        //UpCast
        BaseClass instansUp=instans;
        instansUp.method();

        //DownCast
        DerivedClass instansDown=(DerivedClass) instansUp;
        instansDown.method();
    }
}
