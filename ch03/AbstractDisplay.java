package ch03;

public abstract class AbstractDisplay { // 抽象クラス(abstract class)
    public abstract void open(); // サブクラスに実装を任せる抽象メソッド open
    public abstract void print(); // サブクラスに実装を任せる抽象メソッド print
    public abstract void close(); // サブクラスに実装を任せる抽象メソッド close

    // この抽象クラスを実装しているメソッド display
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
