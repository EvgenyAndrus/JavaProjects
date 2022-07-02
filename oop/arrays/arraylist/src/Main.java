import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("student");
        arrayList.add("would you?");
        System.out.println(arrayList);
        arrayList.add(0,"teacher");
        arrayList.remove(1);
        arrayList.remove("would you?");
        System.out.println(arrayList);
        System.out.println("-------------------------");
        arrayList.clear();
        arrayList.add("name");
        arrayList.add("surname");
        arrayList.ensureCapacity(1000000);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.indexOf("name"));
        System.out.println("-------------------------");
        ArrayList<Integer>arrayList1=new ArrayList<>();
        for (int i=0;i<1000000;i++){
            arrayList1.add(i);
        }
        arrayList1.add(3);
        arrayList1.add(5);
        arrayList1.add(7);
        Iterator<Integer> iterator=arrayList1.iterator();

        while (iterator.hasNext()){
            Integer integer=iterator.next();
            System.out.println(integer);
        }
        ListIterator<Integer>listIterator=arrayList1.listIterator();

        while (listIterator.hasNext()){
            Integer integer= listIterator.next();
            System.out.println(integer);
        }


    }
}
