package base;

import org.apache.commons.lang3.StringUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


public class LoadProperties {
    public static String user = loadProperties("src/test/java/properties/user.properties");

    private static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(filePath);
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }

    public static String getPropertyValue(String path, String key){
        Properties property = loadProperties(path);
        String result = "";
        Set<String> values = property.stringPropertyNames();
        for(String value : values){
            if(StringUtils.equalsIgnoreCase(value, key)){
                result = property.getProperty(value);
                break;
            }
        }
        return result;
    }
}