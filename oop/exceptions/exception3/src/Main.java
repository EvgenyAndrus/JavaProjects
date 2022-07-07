class UserException extends Exception{
    public void method(){
        System.out.println("моё исключение");
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        }catch (UserException e){
            System.out.println("обработка исключений");
            e.method();
        }
    }
}
