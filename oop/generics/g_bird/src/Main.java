public class Main {
    public static void main(String[] args) {
        Strauss[] s ={new Strauss(55),new Strauss(60)};
        Penguin[] p ={new Penguin(12),new Penguin(16),new Penguin(18)};
        Logic<Strauss> l=new Logic<>(s);
        l.display();
        Logic<Penguin> lp=new Logic<>(p);
        lp.display();
        Logic.weightCompare(l,lp);
    }
}
