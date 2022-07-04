class MyClass{
    private int field=0;
    public class Inner{
        MyClass myClass=new MyClass();
        public void method(int a){
            myClass.field=a;
            System.out.println(myClass.field);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyClass.Inner a=new MyClass().new Inner();

        a.method(8);
    }
}
