package section20.heranca;

public class Student extends Person{

    private int id;
    private int year;
    private String college;

    public Student(String name, String age, String email, int id, int year, String college) {
        super(name, age, email);
        this.id = id;
        this.year = year;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + getName() +
                ", e-mail=" + getEmail() +
                ", year=" + year +
                ", college='" + college + '\'' +
                '}';
    }
}
