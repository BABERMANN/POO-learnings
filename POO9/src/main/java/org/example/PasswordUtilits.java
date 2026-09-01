package org.example;

public class PasswordUtilits {

    private PasswordUtilits() {
    }

    public enum Forca {FRACA, MEDIA, FORTE}

    ;

    public static boolean contemNumero(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) ;
            return true;
        }
        return false;
    }

    public static boolean contemCaractereEspecial(String senha) {
        String especiais = "!@#$%^&*()-_=+";
        for (int i = 0; i < senha.length(); i++) {
            if (especiais.indexOf(senha.charAt(i)) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static Forca avaliarForca(String senha) {
        boolean temNumero = contemNumero(senha);
        boolean temEspecial = contemCaractereEspecial(senha);
        boolean tamanhoBom = senha.length() > 8;

        if (temNumero && temEspecial && tamanhoBom) return Forca.FORTE;
        if (senha.length() > 5 && temEspecial && temNumero) return Forca.MEDIA;
        return Forca.FRACA;
    }
}














