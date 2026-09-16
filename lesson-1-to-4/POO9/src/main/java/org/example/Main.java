package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello word");

        String senha = "senha";
        String senha2 = "se53%3";
        String senha3 = "senha1234#$%";

        System.out.println(PasswordUtilits.avaliarForca(senha));
        System.out.println(PasswordUtilits.avaliarForca(senha2));
        System.out.println(PasswordUtilits.avaliarForca(senha3));

    }
}