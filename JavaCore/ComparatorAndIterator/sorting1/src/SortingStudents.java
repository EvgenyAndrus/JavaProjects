import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks={7,8,9,0,3,11};
        String[] students={"Andrew","Yevhenii","Karina","Alex"};

        Arrays.sort(marks);
        Arrays.sort(students);
        for(int temp:marks){
            System.out.print(temp+" ");
        }
        System.out.println();
        for(String temp:students){
            System.out.print(temp+" ");
        }

    }
}
