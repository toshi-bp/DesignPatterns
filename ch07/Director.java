package ch07;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("From morning to noon");
        builder.makeItems(new String[] {
            "Good morning",
            "Hello",
        });
        builder.makeString("At night");
        builder.makeItems(new String[] {
            "Good evening",
            "Good night",
            "Good bye",
        });
        builder.close();
    }
}
