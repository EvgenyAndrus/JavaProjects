public class Main {
    public static void main(String[] args) {
        Animal cat=new Animal("Sphynx",4000);
        Animal dog=new Animal("Malamute",5000);
        Animal bird=new Animal("Crow",2000);

        Animal[] animals={cat,dog,bird};

        for (Animal temp :animals) {
            temp.price = temp.price + 1000;//можно менять поле объекта
            temp=new Animal("Lion",20000);//нельзя поменять объекты в массиве
                                                     //таким образом
        }
        for (Animal temp:animals){
            System.out.printf("breed: %15s price: %d\n",temp.breed,temp.price );
        }
    }
}
