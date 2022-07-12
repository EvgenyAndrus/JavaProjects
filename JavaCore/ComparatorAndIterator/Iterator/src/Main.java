import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(8);
        System.out.println(arrayList);

        Iterator<Integer> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            Integer temp= iterator.next();
            System.out.println(temp);
        }
        System.out.println("-------------------------");
        ListIterator<Integer> listIterator=arrayList.listIterator();
        while (listIterator.hasNext()){
            Integer temp= listIterator.next();
            System.out.println(temp);
        }
    }
}
