public class Animal implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;
    Animal(String breed, int weight, int speed, int price){
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }
    @Override
    public String toString(){
        return this.breed+" "+this.weight+" "+this.speed+" "+this.price;
    }
    public int compareTo(Object o){
        int temp=this.speed-((Animal)o).speed;
        if(temp==0){
            return this.price-((Animal)o).price;
        }
        return temp;
        //return this.breed.compareTo(((Animal)o).breed);//для сравнения строк
    }
}
