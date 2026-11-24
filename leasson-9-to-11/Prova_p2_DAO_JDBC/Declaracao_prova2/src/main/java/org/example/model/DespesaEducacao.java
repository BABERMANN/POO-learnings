package org.example.model;

public class DespesaEducacao extends Despesa{
    public static final double DEDUCAOMAX = 2000.00;
    private String nomeInstituicao;


    public DespesaEducacao(Integer id, String descricao, double valor, String cnpj, String nomeInstituicao) {
        super(id, descricao, valor, cnpj);
        this.nomeInstituicao = nomeInstituicao;

        if(valor > DEDUCAOMAX) throw new IllegalArgumentException("Value execed max dedution");
    }
}
