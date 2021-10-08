package ch03;

public class StringDisplay extends AbstractDisplay{

    private String string;
    private int width; // バイト単位で計算した文字列の「幅」
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void open() {
        printLine();
    }
    public void print() {
        System.out.println("|" + string + "|");
    }
    public void close() {
        printLine();
    }

    // widthの分だけ線を引く関数
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
