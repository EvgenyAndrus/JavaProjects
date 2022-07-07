class ClassWithException{
    public void throwInner() throws Exception{
        throw new Exception("это внутреннее исключение");
    }
    public void catchInner() throws Exception{
        try {
            this.throwInner();
        }catch (Exception e){
            throw new Exception("это внешнее исключение",e);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ClassWithException instance=new ClassWithException();
        try {
            instance.catchInner();
        }catch (Exception exception){
            System.out.println("exception caught:"+ exception.getMessage());
            System.out.println("cause exception:"+ exception.getCause());
        }
    }
}
