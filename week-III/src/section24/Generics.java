package section24;

public class Generics {
    public static void main(String[] args) {
        MyList<String> listaPersonalizada = new MyList<>();
        listaPersonalizada.add("Joel");
        listaPersonalizada.add("Louise");
        listaPersonalizada.add("Gabriel");

        System.out.println(listaPersonalizada.getList());

        MyListOfNumbers<Integer> listaPersonalizada2 = new MyListOfNumbers<>();
        listaPersonalizada2.add(1);
        listaPersonalizada2.add(101);
        listaPersonalizada2.add(105);
        listaPersonalizada2.add(109);

        System.out.println(listaPersonalizada2.getList());


    }
}
