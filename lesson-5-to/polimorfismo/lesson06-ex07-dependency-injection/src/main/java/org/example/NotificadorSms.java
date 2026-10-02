package org.example;

public class NotificadorSms implements Notificador {


    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}
