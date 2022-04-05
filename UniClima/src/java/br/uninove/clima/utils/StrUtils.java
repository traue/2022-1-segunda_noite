package br.uninove.clima.utils;

public class StrUtils {

    public static String primeiraMaiuscula(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
        
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
