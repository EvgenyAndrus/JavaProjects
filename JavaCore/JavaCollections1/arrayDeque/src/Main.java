import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Создаем объект ArrayDeque
        ArrayDeque<String> states = new ArrayDeque<>(); //работает быстрее стека. определяет поведение
                                                        // двунаправленной очереди, которая работает
                                                        // как обычная однонаправленная очередь,
                                                        // либо как стек
        // Стандартное добавление элементов
        states.add("Беларусь");
        states.add("Франция");
        states.add("Австралия");
        states.add("Австрия");
        states.add("Бахрейн");
        states.add("Бельгия");
        states.add("Вьетнам");
        states.add("Гвинея");
        states.add("Дания");
        states.add("Италия");

        ArrayDeque<String> states2=new ArrayDeque<>();//как стек
        states2.push("Беларусь");
        states2.push("Франция");
        states2.push("Австралия");
        states2.push("Австрия");
        states2.push("Бахрейн");
        states2.push("Бельгия");
        states2.push("Вьетнам");
        states2.push("Гвинея");
        states2.push("Дания");
        states2.push("Италия");
        // Добавляем элемент в самое начало
        // states.push("Великобритания");

        // Получаем первый элемент без удаления
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) { //как очередь
            // Извлечение c начала
            System.out.println(states.pop());
        }
        System.out.println("--------------------------");
        while (states2.peek() != null) { //как стек

            System.out.println(states2.pop());
        }
        System.out.println("Размер очереди: " + states.size());
        System.out.println("--------------------------");
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}

class Person {
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}

