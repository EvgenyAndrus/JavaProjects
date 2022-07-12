import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat=new Animal("Oriental",7,25,5000);
        Animal dog=new Animal("Labrador",30,25,4000);
        Animal bird=new Animal("King Penguin",15,20,50000);

        Animal[] animals={cat,dog,bird};

        Arrays.sort(animals);
        for(Animal temp:animals){
            System.out.println(temp);
        }
    }
}