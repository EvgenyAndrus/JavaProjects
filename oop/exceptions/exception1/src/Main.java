public class Main {
    public static void main(String[] args) {
        //Exception ex=new Exception("моё исключение");
        int a=1,n=2;
        try {

           // a=a/(2-n);
           // System.out.println("a= "+a);
            throw new Exception("моё исключение");
        } catch (Exception e) {
            System.out.println("обработка исключения");
            System.out.println(e.getMessage());
        }
    }
}
