public class Main {
    public static void main(String[] args) {
        Bird s =new Strauss();
        Bird p=new Penguin();
        Bird sw=new Swallow();
        Bird [] arr={p,s,sw};
        for (Bird temp: arr ) {
            temp.move();
        }

    }
}
