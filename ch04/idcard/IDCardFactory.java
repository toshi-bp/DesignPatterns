package ch04.idcard;

import ch04.framework.*;
import java.util.*;

public class IDCardFactory extends Factory{
    // HashMap(連想配列)を初期化
    private HashMap database = new HashMap();
    private int serial = 1;
    private List owners = new ArrayList();
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(card.getSerial(), card.getOwner());
    }
    public HashMap getDatabase() {
        return database;
    }
    // protected void registerProduct(Product product) {
    //     owners.add(((IDCard)product).getOwner());
    // }
    // public List getOwners() {
    //     return owners;
    // }
}
