package section28;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 5, 7};

        try(Scanner scanner = new Scanner(System.in)) {
            int value = values[21];
        }
    }
}
