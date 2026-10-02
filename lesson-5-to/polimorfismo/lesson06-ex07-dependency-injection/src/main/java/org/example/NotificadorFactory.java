package org.example;

public class NotificadorFactory {

    private NotificadorFactory(){}

    public static Notificador paraAmbienteDeproducao(){
        return new NotificadorEmail();
    }

    public static Notificador paraAmbienteDeTeste(){
        return new NotificadorSms();
    }
}
