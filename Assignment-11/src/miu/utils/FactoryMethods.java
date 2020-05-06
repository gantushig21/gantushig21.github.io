package miu.utils;

public class FactoryMethods {
    public static String getStringValue(String str) {
        return str == null ? "" : str.trim();
    }
}
