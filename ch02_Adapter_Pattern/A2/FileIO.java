package ch02.A2;

import java.io.*;


// Main(client)�� �ʿ���ϴ� �޼ҵ�
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
