package ch12;

public abstract class Border extends Display{
    // この飾り枠が包んでいる「中身」
    protected Display display;
    // インスタンス生成時に「中身」を引数で指定
    protected Border(Display display) {
        this.display = display;
    }
}
