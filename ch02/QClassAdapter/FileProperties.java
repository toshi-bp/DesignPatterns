package ch02.QClassAdapter;

import java.io.*;
import java.util.*;

// java.util.Propertiesを拡張してファイルの読み込み, 書き込みを行う
public class FileProperties extends Properties implements FileIO{
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "This is header ch02 question");
    }
    public void setValue(String key, String value) {
        setProperty(key, value);
    }
    public String getValue(String key) {
        return getProperty(key);
    }
}
