public class Main {
    public static void main(String[] args) {
        Bird p=new Penguin();
        Bird s=new Strauss();
        Bird sw=new Swallow();

        Bird []b ={p,s,sw};

        for (Bird temp:b ) {
            temp.live();
            temp.eat();
            temp.move();
        }
    }
}
