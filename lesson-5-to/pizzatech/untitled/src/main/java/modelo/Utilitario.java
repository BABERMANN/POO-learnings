package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Utilitario {

    private Utilitario() {
    }

    public static List<String> carregarLinhas(String caminho) throws IOException {
        return Files.readAllLines(Path.of(caminho));
    }

    public static String textoFixo(String texto,int i){
        return "";
    }



}
