public class Main {
    public static void main(String[] args) {
        NotStaticClass notStaticClass=new NotStaticClass(1);
        NotStaticClass notStaticClass1=new NotStaticClass(2);

        notStaticClass.method();
        notStaticClass1.method();

        NotStaticClass.field=1;

        notStaticClass.method();
        notStaticClass1.method();


    }
}
