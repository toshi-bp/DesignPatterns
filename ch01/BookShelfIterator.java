package ch01;

public class BookShelfIterator implements Iterator{
    // 本棚をスキャンするクラス
    // implement IteratorでIteratorインターフェースを実装

    // BookShelfIteratorがスキャンする本棚
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        else {
            return false;
        }
    }
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
