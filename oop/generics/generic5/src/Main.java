//Плохой пример. Так делать не рекомендуется.
class MyClass<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a + (Integer) b);
        }

        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a + (Double) b);
        }

        return (T) (Object) 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> my = new MyClass<>();
        MyClass<Double> my1 = new MyClass<>();
        int sum = my.add(2, 3);
        System.out.println(sum);
        double sum2 = my1.add(22.3, 3d);
        System.out.println(sum2);
    }
}