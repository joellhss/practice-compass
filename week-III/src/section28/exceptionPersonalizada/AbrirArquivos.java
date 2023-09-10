package section28.exceptionPersonalizada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AbrirArquivos {
    private File arquivo;

    public AbrirArquivos() {
        this.arquivo = new File("arquivo.txt");
    }

    public FileReader arquivoExiste() {
        try {
            return new FileReader(arquivo);
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    public void reader() throws ExceptionPersonalizada {
        if (arquivoExiste() != null) {
            System.out.println("Este é o arquivo");
        } else {
            throw new ExceptionPersonalizada("Arquivo não encontrado! Por favor, tente novamente.");
        }
    }

}
