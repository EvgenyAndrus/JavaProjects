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
            System.out.println("обработка исключения 1");
            e.method();
            try {
                throw e;
            }catch (Exception exception){
                System.out.println("обработка исключения 2");
                e.method();
            }
        }
        finally {
            System.out.println("block finally");
        }
        System.out.println("end code");
    }
}
