public class Book {
    private int id;
    private String name;
    private String author;
    private String year;
    private String publisher;
    private String category;
    public Book() {
    }
    public Book(int id, String name, String author, String year, String publisher, String kategoriya) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.category = category;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}