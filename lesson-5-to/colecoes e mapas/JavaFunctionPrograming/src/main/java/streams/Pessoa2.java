package streams;

public class Pessoa2 {
    final  String name;
    final org.example.Pessoa.Genero genero;

    public Pessoa2(String name, org.example.Pessoa.Genero genero) {
        this.name = name;
        this.genero = genero;
    }

    enum Genero{
        MASCULINO,FEMINIO, BINARIO
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", genero=" + genero +
                '}';
    }
}
