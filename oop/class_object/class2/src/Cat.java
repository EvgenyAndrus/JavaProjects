public class Cat {
    String name;
    Cat(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Cat c1=new Cat("barsik");
        Cat c2=c1;
        System.out.println(c1==c2?"cat`s equals":"they`re not");//== сравнение по ссылке
        c2=new Cat("barsik");
        System.out.println(c1==c2?"cat`s equals":"they`re not");
        String a="barsik";
        String b=new String("barsik");
        System.out.println(a.equals(b));
        System.out.println(a==b?"cat`s equals":"they`re not");
    }
}
