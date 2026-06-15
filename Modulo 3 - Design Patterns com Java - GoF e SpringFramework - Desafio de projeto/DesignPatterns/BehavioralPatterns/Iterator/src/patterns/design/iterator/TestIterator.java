package patterns.design.iterator;

public class TestIterator {

    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea behind iterator is to iterate over a data structure without the necessity of knowing it entirelly


        Library library = new Library(5);

        library.addBook(new Book("Dom quixote"));
        library.addBook(new Book("War and peace"));
        library.addBook(new Book("Brothers karamazov"));

        Iterator<Book> iterator = library.createIterator();

        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getTitle());

        }


        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
