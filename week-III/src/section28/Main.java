package section28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("main - Init");
        method1();
        System.out.println("main - Finish");
    }

    private static void method1() {
        System.out.println("method1 - Init");
        method2();
        System.out.println("method1 - Finish");
    }

    private static void method2() {
        System.out.println("method2 - Init");
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
//            String value = null;
//            value.length();
            int[] values = {1, 2, 4, 7};
            int value = values[4];
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException - " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception - " + ex.getMessage());
        } finally {
            assert scanner != null;
            scanner.close();
            System.out.println("O código é executado independentemento do resultado do try");
        }

        System.out.println("method2 - Finish");
    }
}
