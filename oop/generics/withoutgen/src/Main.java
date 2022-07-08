public class Main {
    public static void main(String[] args) {
        WithoutGen w1=new WithoutGen("test");
        WithoutGen w2=new WithoutGen(222);
        WithoutGen w3=new WithoutGen(new Cat("barsik"));
        w1.display();
        w2.display();
        w3.display();
        w1=w2; //тут работает
        w1.display();
        String s= (String) w1.getObj();// ошибка во время выполнения
    }
}

class WithoutGen{
    Object obj;
    WithoutGen(Object obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj);
    }
    Object getObj(){
        return this.obj;
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