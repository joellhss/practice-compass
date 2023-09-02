package section20.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private String author;

    private List<Review> reviews;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;

        this.reviews = new ArrayList<Review>();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
