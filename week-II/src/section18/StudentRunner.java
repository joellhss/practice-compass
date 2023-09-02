package section18;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Joel");
        student1.addNewMark(9.5);
        student1.addNewMark(10.0);
        student1.addNewMark(8.5);

        Student student2 = new Student("Louise", 10.0, 9.5, 7.5);

        System.out.println(student1.getMinimumMark());
        System.out.println(student1.getMaximumMark());
        System.out.println(student1.getAverageMark());
        System.out.println(student1.getNumberOfMarks());
        System.out.println(student1.getTotalSumOfMarks());

        System.out.println(student1);
        System.out.println(student2);

    }
}
