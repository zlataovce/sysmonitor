package me.zlataovce.sysmonitor.utils;

import lombok.Getter;

import java.io.*;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigManager {
    @Getter
    private final Properties prop = new Properties();

    private final TokenLib gen = new TokenLib();

    public ConfigManager() {
        this.createConfig();
        try {
            prop.load(new FileInputStream("app.config"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createConfig() {
        try {
            File file = new File(Paths.get(System.getProperty("user.dir")).toString(), "app.config");
            if (!file.exists()) {
                FileWriter writer = new FileWriter(file);
                writer.write("apitoken=" + gen.urlsafeToken(10));
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
