package section28.exceptionPersonalizada;

import java.io.FileNotFoundException;

public class Teste {
    public static void main(String[] args) {
        AbrirArquivos newArquivo = new AbrirArquivos();
        try {
            newArquivo.reader();
        } catch (ExceptionPersonalizada e) {
            e.getStackTrace();
            String text = null;
            System.out.println(text.length());
        }

        System.out.println("Continuação do código");
    }
}
