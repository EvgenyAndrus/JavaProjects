import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Animal("Sphynx",5000));
        animals.add(new Animal("Malamute",4000));
        Iterator<Animal>iterator=animals.iterator();
        while (iterator.hasNext()){
            Animal temp=iterator.next();
            temp.price+=1000;
        }
        System.out.println(animals);
    }
}
class Animal{
    String breed;
    int price;
    Animal(String breed,int price){
        this.breed=breed;
        this.price=price;
    }

    @Override
    public String toString() {
        return breed+" "+price;

    }
}