class MyClass{
    public void myMethod() throws Exception{
        Exception exception = new Exception("моё исключение");
        throw exception;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            MyClass myClass=new MyClass();
            myClass.myMethod();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("stack trace:");
            e.printStackTrace();
        }
    }
}
