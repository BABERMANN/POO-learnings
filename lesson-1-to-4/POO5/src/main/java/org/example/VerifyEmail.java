package org.example;

public class VerifyEmail {
    private String email;


    public VerifyEmail(String email){
        if(email == null) throw new IllegalArgumentException("Email invalido");
        if(!verify(email)) throw new IllegalArgumentException("Email invalido");
        this.email = email;
    }

    public boolean verify(String email){
        int primeiro = email.indexOf("@");
        int ultimo = email.lastIndexOf("@");

        if (primeiro != ultimo) return false;            // mais de um "@"
        if (primeiro == 0) return false;                 // nada antes do "@"
        if (primeiro == email.length() - 1) return false; // "@" é o último caractere

        String local = email.substring(0, primeiro);
        String domain = email.substring(primeiro + 1);

        if (!domain.contains(".") || domain.startsWith(".") || domain.endsWith(".")) return false;

        System.out.println("Email valido");
        return true;
    }}


