package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Cliente implements Comparable<Cliente> {
    private String nome;
    private LocalDate dataNasc;
    private List<Double> valoresPedidos;
    private Ranking<Cliente> ranking;

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM/dd");



    public Cliente(String nome, LocalDate dataNasc, List<Double> valoresPedidos) {

        this.nome = nome;

        if(ChronoUnit.SECONDS.between(dataNasc,LocalDate.now()) > 0 ) throw new IllegalArgumentException("Data de nascimento futura");
        this.dataNasc = dataNasc;

        this.valoresPedidos = valoresPedidos;
    }

    public void registraPedido(double pedido){

    }

    public int getIdade(LocalDate hoje){
        return Period.between(dataNasc, hoje).getYears();
    }

    public boolean fazAniversario(LocalDate hoje){
        return hoje.format(FORMAT).equals(dataNasc.format(FORMAT));
    }

    @Override
    public int compareTo(Cliente outro) {
        List<Double> meus  = new ArrayList<>(valoresPedidos);
        List<Double> deles = new ArrayList<>(outro.valoresPedidos);
        meus.sort(Comparator.reverseOrder());
        deles.sort(Comparator.reverseOrder());

        int menor = Math.min(meus.size(), deles.size());
        for (int i = 0; i < menor; i++) {
            int r = Double.compare(meus.get(i), deles.get(i));
            if (r != 0) return r;
        }

        int r = Integer.compare(meus.size(), deles.size());   /
        if (r != 0) return r;

        return nome.compareTo(outro.nome);




    }


    public String getNome() {
        return nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public List<Double> getValoresPedidos() {
        return valoresPedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(dataNasc, cliente.dataNasc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNasc);
    }
}
