package section11.isVowel;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar ch = new MyChar('J');
        System.out.println(ch.isVowel());
        System.out.println(ch.isConsonant());
        System.out.println(ch.isDigit());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();

    }
}
