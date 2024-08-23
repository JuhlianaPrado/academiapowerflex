package com.academia.powerflex.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Plano {

    private Long id;

    private String plano;

    private String descricao;

    private String valor;

    // Atributos de apoio
    // Transient-> representa um atributo que NÃO CORRESPONDE A UMA COLUNA DA TABELA


    private String mensagemErro = "";

    private boolean isValid = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
