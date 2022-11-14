package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReaderHelper
{
   private static Properties properties = new Properties();
    private final static String propFilePath = System.getProperty("user.dir")+"/src/main/resources/config.properties";
    public static String getCustomProperty(String customPropertyName)
    {
        try {
            properties.load(new FileInputStream(propFilePath));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  properties.getProperty(customPropertyName);
    }
}
