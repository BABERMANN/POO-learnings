package org.example;

public class Video {
    private String titulo;
    private int curtidas;
    private int desturtidas;

    public Video(String titulo) {
        this.titulo = titulo;
        this.curtidas = 0;
        this.desturtidas = 0;
    }

    public void curtirVideo(){
        curtidas++;
    }

    public void descurtirVideo(){
        desturtidas++;
    }

    public int Getsaldo(){
        return curtidas - desturtidas;
    }
}
