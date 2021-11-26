package ch07.question2;

public abstract class Builder {
    // private boolean initialized = false;
    // public void makeTitle(String title) {
    //     if (!initialized) {
    //         buildTitle(title);
    //         initialized = true;
    //     }
    // }
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
    // public abstract void buildTitle(String title);
}