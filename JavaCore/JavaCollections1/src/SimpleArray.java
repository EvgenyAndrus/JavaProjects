import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(0,30);
        al.add(40);
        al.clear();
        System.out.println("\n"+al.size());
        for (int i=0;i<100;i++){
            al.add(i);
            System.out.print(al.get(i)+" ");
        }
        System.out.println("\n"+al.size());
        for (int i=0;i<50;i++ ) {
            al.remove(0);
        }
        System.out.println("\n"+al.size());
        for (Integer integer : al) {
           System.out.print(integer+" ");
        }
        System.out.println("\n"+al.size());
        al.trimToSize();



        //        // ошибка при использовании сырого типа raw
//        ArrayList list=new ArrayList();
//        list.add("simple");
//        list.add(25);
//        ArrayList<Integer> list2=new ArrayList<>();
//        list2.add((Integer) list.get(0));
//        System.out.println(list2.get(0));
    }
}
