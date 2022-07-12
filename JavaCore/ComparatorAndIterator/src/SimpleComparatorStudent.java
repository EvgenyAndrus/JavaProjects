import java.util.Arrays;
import java.util.Comparator;

public class SimpleComparatorStudent {
    private String firstName;
    private int group;

    public int getGroup() {
        return group;
    }

    public String getFirstName() {
        return firstName;
    }

    public SimpleComparatorStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }
}
class ComparatorStudent implements Comparator<SimpleComparatorStudent>{
    @Override
    public int compare(SimpleComparatorStudent o1, SimpleComparatorStudent o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
class Ma5in{
    public static void main(String[] args) {
        SimpleComparatorStudent[] myStudents={
                new SimpleComparatorStudent("Zohan",333),
                new SimpleComparatorStudent("Yevhenii",333),
                new SimpleComparatorStudent("Andrew",222),
                new SimpleComparatorStudent("Karina",111),
                new SimpleComparatorStudent("Alex",300),
                new SimpleComparatorStudent("Igor",300),
                new SimpleComparatorStudent("Peter",300),
        };
        Arrays.sort(myStudents,new ComparatorStudent());

        System.out.println("sort by group");
        for (SimpleComparatorStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}
