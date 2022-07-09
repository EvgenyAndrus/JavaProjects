import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //ошибка во время выполнения
        Number[] num=new Integer[10];//массивы ковариантны
        num[0]=10.10d;              // наследование исходных типов
        System.out.println(num[0]); // переносится на производные типы

        //List<Number> list=new ArrayList<Integer>(); //инвариантны.
                                                    // наследование исходных типов
                                                    // не переносится на производные типы

    }
}
