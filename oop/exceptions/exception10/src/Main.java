public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7};
        int a=5,b=0;

        try {
            System.out.println(arr[8]);
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
