package ch01;

public interface Iterator {
    // 数え上げ, スキャンを行うインターフェース
    // 「次の要素」が存在するか否かを調べるメソッド
    public abstract boolean hasNext();
    // 「次の要素」を得るためのメソッド
    public abstract Object next();
}
