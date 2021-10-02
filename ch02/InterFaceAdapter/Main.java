package ch02.InterFaceAdapter;

public class Main {
    public static void main(String[] args) {
        // 「`Print`インターフェースのメソッドを利用している」ということを強調するためにPrintBannerではなく, Printと書いている
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
