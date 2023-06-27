package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties getPropertyObject() throws IOException {
        FileInputStream fp = new FileInputStream("Config_Details/config.properties");
        Properties prop = new Properties();
        prop.load(fp);
        return prop;
    }
    public static String getUrl() throws IOException {
        return getPropertyObject().getProperty("url");
    }
}
