public class Main {
    public static void main(String[] args) {
        WithGen<String > w1=new WithGen<>("test");
        WithGen<Integer > w2=new WithGen<>(222);
        WithGen<Cat > w3=new WithGen<>(new Cat("barsik"));
        w1.display();
        w2.display();
        w3.display();
        //w1=w2; //несоответствие типов
    }
}

class WithGen<T>{
    T obj;
    WithGen(T obj){
         this.obj=obj;
    }
    void display(){
        System.out.println(obj);
    }
}
class Cat{
    String name;
    Cat(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}