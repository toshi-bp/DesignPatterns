package ch04.framework;

public abstract class Product {
    /**
     * public abstract Product(String name);
     * javaではabstractなコンストラクタを作ることができない
     * コンストラクタは継承されないため, abstractなコンストラクタに意味はない
     * 名前を引数として与えることを強制するためには, 専用のメソッドを作成する必要がある
     */
    public abstract void use();
    public abstract void name();
}
