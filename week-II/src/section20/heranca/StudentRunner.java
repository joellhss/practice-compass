package section20.heranca;

public class StudentRunner {
    public static void main(String[] args) {
        Student joel = new Student("Joel", "26", "joel@email.com", 786, 2023, "Compass UOL");
        System.out.println(joel);
        joel.setName("Joel Sousa");
        System.out.println(joel);

        Person louise = new Person("Louise", 26, "louise@email.com");

    }
}
