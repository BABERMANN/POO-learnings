package org.example;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello");

        ServicoAlerta alertaPorEmail = new ServicoAlerta(new NotificadorEmail());
        ServicoAlerta alertaPorSms = new ServicoAlerta(new NotificadorSms());

        alertaPorEmail.dispararAlerta("Vai estudar java");
        alertaPorSms.dispararAlerta("Vai estudar java");
    }
}