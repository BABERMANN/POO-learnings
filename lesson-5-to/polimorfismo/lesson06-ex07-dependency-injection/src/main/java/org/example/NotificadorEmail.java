package org.example;

public class NotificadorEmail implements Notificador {


    @Override
    public void enviar(String mensagem) {
        System.out.println("E-mail: " + mensagem);
    }
}
