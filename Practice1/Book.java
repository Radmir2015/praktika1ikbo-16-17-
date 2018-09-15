public class Book {
    String title = "";
    String author = "";
    int nPages = 0;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPages(int pages) {
        this.nPages = pages;
    }

    public int getPages() {
        return this.nPages;
    }

    public Book(String title, String author, int pages) {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
    }

    public String getInfo() {
        return "Title: " +  this.title + "\nAuthor: " + this.author + "\nTotal pages: " + this.nPages;
    }

    public Book add(Book book) {
        this.title += " + " + book.title;
        this.author += " & " + book.author;
        this.nPages += book.nPages;

        return this;
    }
}
