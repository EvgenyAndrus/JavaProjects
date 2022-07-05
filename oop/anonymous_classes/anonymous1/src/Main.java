interface Interface1{
    void method();
}

public class Main {
    public static void main(String[] args) {
        Interface1 interface1=new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };

        //System.out.println(interface1.getClass().toString());
        interface1.method();
    }
}
