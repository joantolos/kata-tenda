package com.joantolos.tenda;

public class Translations {

    private static Translations instance;

    private Translations() {
        // Constructor privat per evitar la creació directa d'instàncies
    }

    public static Translations getInstance() {
        if (instance == null) {
            instance = new Translations();
        }
        return instance;
    }

    public String getTranslation(String translationId) {
        // Implementació per obtenir la traducció
        // ...
        return "";
    }
}
