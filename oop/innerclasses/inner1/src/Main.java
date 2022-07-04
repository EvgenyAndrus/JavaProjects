class MyClass{
    private static int field=0;
    public class Inner{
        public void method(int a){
            field=a;
            System.out.println(field);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyClass.Inner a=new MyClass().new Inner();

        a.method(8);
    }
}
