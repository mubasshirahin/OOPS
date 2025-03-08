package Online.Online5;

class LibraryItem{
    private int ItemNumber;

    public void checkout(){
        System.out.println("Checkout out of library");
    }
    public void showItem(){
        System.out.println("Item number is: "+ ItemNumber);
    }
}

class Book extends LibraryItem{
    private String bookName;
    private String authorName;

    public Book(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void showItem() {
        super.showItem();
        System.out.println(bookName);
        System.out.println(authorName);
    }
}

class EBook extends LibraryItem{
    private int fileSize;

    @Override
    public void showItem() {
        super.showItem();
        System.out.println(fileSize);
    }
}

public class SetA {
    public static void main(String[] args) {
        Book b = new Book("Ahin","Humu");
        b.showItem();
        b.checkout();
    }

}
