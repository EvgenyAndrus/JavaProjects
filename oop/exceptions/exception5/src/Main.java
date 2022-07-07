public class Main {
    public static void main(String[] args) {
        int a=1,n=2;
        try {
            System.out.println("попытка деления на ноль");
            System.out.println("a/(2-n)=" + (a/(2-n)));
        } catch (Exception e) {
            System.out.println("обработка исключения");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("block finally");
        }
        System.out.println("конец кода");
    }
}
