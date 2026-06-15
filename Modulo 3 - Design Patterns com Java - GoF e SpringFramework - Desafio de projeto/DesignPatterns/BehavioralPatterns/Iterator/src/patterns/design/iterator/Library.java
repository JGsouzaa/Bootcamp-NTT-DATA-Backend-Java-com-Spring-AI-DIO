package patterns.design.iterator;

public class Library implements Aggregate<Book>{

    private Book[] books;
    private int quantity;

    public Library(int capacity){
        books = new Book[capacity];
    }

    public void addBook(Book book){
        books[quantity++] = book;
    }

    @Override
    public Iterator<Book> createIterator(){
        return new BookIterator(books);
    }
}
