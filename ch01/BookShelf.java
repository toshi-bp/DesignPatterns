package ch01;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
    // 本棚を表すクラス
    // implementsでAggregateインターフェースを実装している
    //private Book[] books; // ←クラス外から不用意に変更されるのを防ぐ
    private ArrayList books;
    private int last = 0;

    // 配列の場合
    // public BookShelf(int maxsize) {
    //     this.books = new Book[maxsize];
    // }
    // public Book getBookAt(int index) {
    //     return books[index];
    // }
    // public void appendBook(Book book) {
    //     this.books[last] = book;
    //     last++;
    // }
    // public int getLength() {
    //     return last;
    // }

    // java.util.ArrayListの場合
    public BookShelf(int initialSize) {
        this.books = new ArrayList(initialSize);
    }
    public Book getBookAt(int index) {
        return (Book)books.get(index);
    }
    public void appendBook(Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
