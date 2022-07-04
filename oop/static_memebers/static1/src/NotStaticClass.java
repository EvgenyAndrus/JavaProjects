public class NotStaticClass {
    private int Id;
    public static int field;
    public NotStaticClass(int Id){this.Id=Id;}
    public void method(){
        System.out.println("class Id= "+Id+ "  field="+field);
    }
}
