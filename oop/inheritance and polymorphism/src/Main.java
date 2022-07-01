public class Main {
    Main(){
        System.out.println("Main");
    }
    public static void main(String[] args) {
        Cc c= new Cc();
    }

}
class Aa extends Main{
    Aa(){
        System.out.println("Aa");
    }
}
class Bb extends Aa{
    Bb(){
        System.out.println("Bb");
    }
}
class Cc extends Bb{
    Cc(){
        System.out.println("Cc");
    }
}