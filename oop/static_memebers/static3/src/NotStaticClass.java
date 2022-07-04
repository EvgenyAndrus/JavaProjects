public class NotStaticClass {
    public static final int X;
    static int x;
    static {
        X =10;
        System.out.println("static block X= " + X);
    }
    public NotStaticClass(){
        System.out.println("constructor X= "+ X);
    }
    static {
        x=1;
        System.out.println("x = "+x);
    }
    static {
        x=5;
        System.out.println("x = "+x);
    }static {
        x=-99;
        System.out.println("x = "+x);
    }static {
        x=77;
        System.out.println("x = "+x);
    }
    public NotStaticClass(int x){
        this.x=x;
        System.out.println("constructor x="+x);
    }
}
