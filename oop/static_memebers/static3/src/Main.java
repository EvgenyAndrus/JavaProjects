public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);
        NotStaticClass notStaticClass=new NotStaticClass();
        System.out.println(notStaticClass .X);

        System.out.println(NotStaticClass.x);
        NotStaticClass z=new NotStaticClass(2222);
        System.out.println(z.x);

        System.out.println(NotStaticClass.x);

    }
}
