public class Bird {
    int weight;
    Bird(int weight){
        this.weight=weight;
    }
    void move(){}
}
class Strauss extends Bird{
    Strauss(int weight){
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Run");;
    }
}
class Penguin extends Bird{
    Penguin(int weight){
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Swim");
    }
}
class Logic<T extends Bird>{
    T[] array;
    Logic(T[] array){
        this.array=array;
    }
    void display(){
        for (T temp:array){
            temp.move();
            System.out.println(temp.weight);
        }
    }
    int weightController(){
        int sum=0;
        for (T temp:array){
            sum+= temp.weight;
        }
        return sum;
    }
    static void weightCompare(Logic<?> c1,Logic<?> c2){// Т меняем на ? т.к. в метод
        // в качестве параметров передаются экземпляры женерик классов
        // с разными типами <Strauss> и <Penguin>
        System.out.println(c1.weightController()- c2.weightController());
    }
}