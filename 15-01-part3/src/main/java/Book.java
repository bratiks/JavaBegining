import lombok.Data;

@Data
public class Book {
    private String name;
    private String authorFullName;
    private String nameOfPublisher;
    private String genre;

    private int numberOfPages;
    private int yearOfPublished;

    public Book(String name, String authorFullName, String nameOfPublisher, String genre, int numberOfPages, int yearOfPublished) {
        this.name = name;
        this.authorFullName = authorFullName;
        this.nameOfPublisher = nameOfPublisher;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.yearOfPublished = yearOfPublished;
    }

    public Book() {
        this.name = "name";
        this.authorFullName = "authorFullName";
        this.nameOfPublisher = "nameOfPublisher";
        this.genre = "genre";
        this.numberOfPages = 0;
        this.yearOfPublished = 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorFullName='" + authorFullName + '\'' +
                ", nameOfPublisher='" + nameOfPublisher + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", yearOfPublished=" + yearOfPublished +
                '}';
    }
}
