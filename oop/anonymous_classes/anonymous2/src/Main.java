interface Interface{
    void method();
    void method2();
    int getValue();
}

public class Main {
    public static void main(String[] args) {
        int n=100;
        Interface interface1=new Interface(){
            public double d=1.3;
            protected String str = "Anonymous class";
            private int num=10;
            public int publicField=3;

            @Override
            public void method2() {
                publicField=222;
            }

            @Override
            public int getValue() {
                return publicField;
            }

            @Override
            public void method(){
                num=123;
                publicField=n;
                System.out.println("interface1: d="+d+", str="+
                        str+" num="+num+
                        " publicField="+getPublicField());
            }

            public int getPublicField() {
                return publicField;
            }
        };
        Interface interface2=new Interface() {
            int publicField=-1;
            @Override
            public void method() {

            }

            @Override
            public void method2() {publicField=interface1.getValue();            }


            @Override
            public int getValue() {
                return publicField;
            }
        };
    interface1.method();
    interface2.method2();
        System.out.println("interface1 publicField = "+interface1.getValue());
        System.out.println("interface2 publicField = "+interface2.getValue());
    }
}
