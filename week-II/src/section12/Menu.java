package section12;

public class Menu {

    private int number1;
    private int number2;
    private int choice;
    public Menu(int number1, int number2, int choice) {
        this.number1 = number1;
        this.number2 = number2;
        this.choice = choice;
    }

    public Menu(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void calculate() {
        switch (this.choice) {
            case 1:
                System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
                break;
            case 2:
                System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
                break;
            case 3:
                System.out.println(number1 + "x" + number2 + "=" + (number1 * number2));
                break;
            case 4:
                System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
                break;

        }
    }
}
