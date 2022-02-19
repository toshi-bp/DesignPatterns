package ch15.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    // newでインスタンス生成させないためにprivateとする
    private Database() {}
    public static Properties getProPerties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch(IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
