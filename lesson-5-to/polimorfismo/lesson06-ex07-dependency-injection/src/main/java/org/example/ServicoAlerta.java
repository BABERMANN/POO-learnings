package org.example;

public class ServicoAlerta {
    private Notificador notificador;

    public ServicoAlerta(Notificador notificador){
        this.notificador = notificador;
    }

    public void dispararAlerta(String msg){
        notificador.enviar(msg);
    }
}
