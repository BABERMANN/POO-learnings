package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;


    public Livro(String titulo, String autor, int paginas) {
        if(titulo == null) throw new IllegalArgumentException("titulo invalido ");

        this.titulo= titulo;
        this.autor = (autor == null) ? "Desconhecido" : autor;
        this.paginas = (paginas <= 0) ? 0 : paginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public String getFullBook(String titulo){

    };

}

