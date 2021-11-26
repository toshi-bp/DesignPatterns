package ch07.question2;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        /**
         * Builderのサブクラスのインスタンスが与えられるので
         * builderフィールドに保持しておく
         */
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("朝から昼にかけて");
        builder.makeItems(new String[] {
            "おはようございます",
            "こんにちは",
        });
        builder.makeString("夜に");
        builder.makeItems(new String[] {
            "こんばんは",
            "おやすみなさい",
            "さようなら",
        });
        builder.close();
    }
}
