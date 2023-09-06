package section22.list.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DescSortStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(101, "Joel"),
                new Student(5, "Louise"),
                new Student(60, "Gabriel")
        );

        List<Student> studentsAl = new ArrayList<>(students);

        Collections.sort(studentsAl);

        System.out.println(studentsAl);

        studentsAl.sort(new DescSortStudent());

        System.out.println(studentsAl);
    }
}
