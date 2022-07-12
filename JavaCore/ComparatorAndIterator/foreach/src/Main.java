public class Main {
    public static void main(String[] args) {
        int[] x={2,3,56,8,9,7,5,4,23,1};
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("\n-----------------------");
        for (int temp:x) {
            System.out.print(temp+" ");
        }
        System.out.println("\n-----------------------");
        for (int temp:x) {
            ++temp;
            System.out.print(temp+" ");
        }
        System.out.println("\n-----------------------");
        for (int temp:x) {
            System.out.print(temp+" ");
        }
    }
}
