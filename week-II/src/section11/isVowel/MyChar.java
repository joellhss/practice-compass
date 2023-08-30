package section11.isVowel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyChar {
    private Character value;
    private List<Character> vowels;

    public MyChar(Character value) {
        this.value = value;
        this.vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    }

    public static void printLowerCaseAlphabets() {
        for(char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
    }

    public static void printUpperCaseAlphabets() {
        for(char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }
    }

    public Character getValue() {
        return value;
    }

    public void setValue(Character value) {
        this.value = value;
    }

    public boolean isVowel() {
        return vowels.contains(value);
    }

    public boolean isDigit() {
        return this.value >= 48 && this.value <= 57;
    }

    public boolean isConsonant() {
        if (isVowel()) {
            return false;
        }
        return this.value >= 65 && this.value <= 90 || this.value >= 97 && this.value <= 122;
    }


}
