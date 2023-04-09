package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private FileReader fileReader;

    Properties properties = new Properties();

    private static String browser;

    //private static String version;

    private static String URl;

    public static String getURl() {
        return URl;
    }

    public static String getBrowser() {
        return browser;
    }

    /*public static String getVersion() {
        return version;
    }*/

    {
        try {
            fileReader = new FileReader("src/main/resources/properties/system.properties");
            properties.load(fileReader);
            browser = properties.getProperty("browser");
            //version = properties.getProperty("browserVersion");
            URl = properties.getProperty("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
