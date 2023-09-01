package section16;

import java.time.LocalDate;

public class TestRunner {
    public static void main(String[] args) {
        String nome = "Joel Henrique";
        String s = nome.concat(" Santana de Sousa");
        System.out.println(s);

        StringBuffer nomeB = new StringBuffer("Joel Henrique");
        nomeB.append(" Santana de Sousa");
        System.out.println(nomeB);


        String idade = "26";
        Integer idadeInt = Integer.parseInt(idade);

        Integer ano = Integer.valueOf(2023);
        int anoPrimitive = ano.intValue();

        int result = ano.compareTo(idadeInt); // Retorna 1 se for maior, 0 se for igual e -1 se for menor
        boolean resultBoolean = ano.equals(idadeInt);
        System.out.println(result);
        System.out.println(resultBoolean);



        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.plusYears(100));


    }
}
