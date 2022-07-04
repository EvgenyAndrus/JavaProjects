public class NotStaticClass {
    private int id;
    public NotStaticClass(int id){
        this.id=id;
    }
    public static void method(){
        //System.out.println("id= "+ id);
    }
}
