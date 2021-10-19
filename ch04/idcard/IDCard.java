package ch04.idcard;
import ch04.framework.*;

public class IDCard extends Product{
    private String owner;
    private int serial; // 通し番号
    // コンストラクタがpublicになっていないのは, idcardパッケージ外でnewを使って生成できないようにするためである
    IDCard(String owner, int serial) {
        System.out.println(owner + "(" + serial + ")" + "のカードを作ります.");
        this.owner = owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println(owner + "(" + serial + ")" + "のカードを使います.");
    }
    public void name() {
        System.out.println("このカードは" + owner + "(" + serial + ")" + "のものです.");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
