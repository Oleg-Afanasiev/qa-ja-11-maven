package com.academy.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyProvider {
    private static final String DEFAULT_PROP_FILE = "config.properties";
    private static Properties prop;

    // блок статической инициализации
    static {
        init();
    }

    private static void init() {
        try {
            prop = new Properties();
            InputStream is = PropertyProvider.class.getClassLoader().getResourceAsStream(DEFAULT_PROP_FILE);
            prop.load(is); // загружаем физический файл с пропертями
        } catch (IOException | RuntimeException e) {
//            LOG.error("Error prop initialization. Details: {}", e.getMessage());
        }
    }

    // метод отдает проперти по ключу
    public static String get(String key) {
        return prop.getProperty(key);
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(prop.getProperty(key));
    }
}
