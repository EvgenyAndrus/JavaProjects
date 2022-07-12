import java.util.Comparator;
public class Animal {
    String breed;
    int weight;
    int speed;
    int price;
    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }
    @Override
    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }
}