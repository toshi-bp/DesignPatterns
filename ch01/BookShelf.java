package ch01;

public class BookShelf implements Aggregate{
    // 本棚を表すクラス
    // implementsでAggregateインターフェースを実装している
    private Book[] books; // ←クラス外から不用意に変更されるのを防ぐ
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
