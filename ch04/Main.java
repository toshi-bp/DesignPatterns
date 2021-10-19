package ch04;

import ch04.framework.*;
import ch04.idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("モンキー・D・ルフィ");
        Product card2 = factory.create("孫悟空");
        Product card3 = factory.create("うずまきナルト");
        card1.use();
        card2.use();
        card3.use();
        card1.name();
        card2.name();
        card3.name();
    }
}
