package section22.map;

import java.util.HashMap;
import java.util.Map;

public class CountOccurances {
    public static void main(String[] args) {
        String frase = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        Map<Character, Integer> count = new HashMap<>();

        char[] fraseToArray = frase.toCharArray();

        for (char character:fraseToArray) {
            Integer integer = count.get(character);
            if(integer == null){
                count.put(character, 1);
            } else {
                count.replace(character, ++integer);
            }
        }

        System.out.println(count);
    }
}
