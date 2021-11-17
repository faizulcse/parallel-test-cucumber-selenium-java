package utils;

import java.util.ResourceBundle;

public class ResourceUtils {
    private ResourceBundle bundle;

    public ResourceUtils getResource(String file) {
        try {
            bundle = ResourceBundle.getBundle(file);
        } catch (Exception e) {
            System.out.println("Please enter a valid config file name.");
            System.out.println(e);
            System.exit(0);
        }
        return this;
    }

    public String getString(String key) {
        return bundle.getString(key);
    }

    public int getInteger(String key) {
        return Integer.parseInt(bundle.getString(key));
    }

    public boolean getBoolean(String key) {
        return Boolean.parseBoolean(bundle.getString(key));
    }
}
