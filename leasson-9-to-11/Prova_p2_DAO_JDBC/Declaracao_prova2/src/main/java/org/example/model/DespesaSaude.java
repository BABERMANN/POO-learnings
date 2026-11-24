package org.example.model;

public class DespesaSaude extends Despesa {
    public static final double DEDUCAOMAX = 1500.00;
    private String registroConselho;

    public DespesaSaude(Integer id, String descricao, double valor, String cnpj, String registroConselho) {
        super(id, descricao, valor, cnpj);
        this.registroConselho = registroConselho;

        if (valor > DEDUCAOMAX) throw new IllegalArgumentException("Value execed max dedution");
    }



}
