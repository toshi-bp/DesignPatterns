package ch02.ClassAdapter;

public class PrintBanner extends Banner implements Print{
    // 用意されている`Banner`クラスを拡張(`extends`)して, `showWithParen`メソッドと`showWithAster`メソッドを継承している
    // 要求されている`Print`インターフェースを実装`implements`して`printWeak`メソッドと`printStrong`メソッドを実装

    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
