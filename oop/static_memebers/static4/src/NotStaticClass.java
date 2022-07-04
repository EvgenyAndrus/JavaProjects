public class NotStaticClass {
    public NotStaticClass(){
        System.out.println("Constructor");
    }
    static {
        System.out.println("static block");
    }
    public static void staticMethod(){
        System.out.println("staticMethod");
    }
    public void notStaticMethod(){
        System.out.println("notStaticMethod");
    }

}
