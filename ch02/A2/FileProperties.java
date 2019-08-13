package ch02.A2;

import java.io.*;
import java.util.*;


// Properties Ŭ������, �̹� �����ϴ� Ŭ�����̴�.
// FileProperties Ŭ������ ����� ������ �Ѵ�.
public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value) {
        setProperty(key, value); // ��ӹ��� Properties Ŭ������ �޼ҵ带 ȣ���Ѵ�.
    }
    public String getValue(String key) {
        return getProperty(key, ""); // ��ӹ��� Properties Ŭ������ �޼ҵ带 ȣ���Ѵ�.
    }
}
