package com.elm.util;

import javax.persistence.Persistence;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
    private static final Properties conf=new Properties();
    static {
        InputStream in = ConfigUtil.class.getClassLoader().getResourceAsStream("config.properties");
        try{
            conf.load(in);
        }
        catch (IOException e){
            e.printStackTrace();//把错误打印到控制台上
        }
    }
    public static String getProp(String key){
        return conf.getProperty(key);
    }
}
