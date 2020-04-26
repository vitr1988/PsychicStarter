package ru.synergyitacademy.util;

import java.nio.charset.StandardCharsets;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ResourceUtil {

    /**
     * Resources which can store localization messages for user
     */
    private static final ResourceBundle RESOURCES = ResourceBundle.getBundle("ru.synergyitacademy.text.messages");

    public static String getText(String key) throws MissingResourceException {
        return key == null ? null :
                new String(RESOURCES.getString(key).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
    }
}
