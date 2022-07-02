public abstract class Bird implements Creator{
    public void  live(){
        System.out.println("I can Live");
    }
    public abstract void move();
    public void eat(){
        System.out.println("I can eat");
    }
}
