package techproed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    static{//static blok runs First
        String path = "configuration.properties";
        try {
            FileInputStream  fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
             fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /// create a method that accepts key and returns value
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(properties.getProperty("url_test_techproed"));
    }

}
