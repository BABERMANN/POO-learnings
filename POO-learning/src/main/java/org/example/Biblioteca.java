import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro l) {
        livros.add(l);
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null; // não encontrado
    }

    public void imprimirLivro(String titulo) {
        Livro encontrado = buscarPorTitulo(titulo);
        if (encontrado == null) {
            System.out.println("Livro não encontrado: " + titulo);
            return;
        }
        System.out.println("Título: " + encontrado.getTitulo());
        System.out.println("Autor: " + encontrado.getAutor());
        System.out.println("Páginas: " + encontrado.getPaginas());
    }
}