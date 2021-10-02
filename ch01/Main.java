package ch01;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("naruto"));
        bookShelf.appendBook(new Book("my hero academia"));
        bookShelf.appendBook(new Book("demon slayer"));
        bookShelf.appendBook(new Book("jujutsu kaisen"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
