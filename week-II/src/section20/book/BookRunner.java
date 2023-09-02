package section20.book;

public class BookRunner {
    public static void main(String[] args) {
        Book newBook = new Book(06, "Java", "Joel Sousa");
        newBook.addReview(new Review(01, "Is a very good book.", 5));
        newBook.addReview(new Review(02, "Very good!!!!", 5));

        System.out.println(newBook);
    }

}
