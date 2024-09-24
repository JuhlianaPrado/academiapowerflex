package com.academia.powerflex.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "plano")
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false, length = 60)
    private String plano;
    @Column(nullable = true, length = 250)
    private String descricao;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private String valor;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_aluno", referencedColumnName = "id", nullable = false)
    private Aluno aluno;

    // Atributos de apoio
    // Transient-> representa um atributo que NÃO CORRESPONDE A UMA COLUNA DA TABELA

    @Transient
    private String mensagemErro = "";
    @Transient
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

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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

    public String getMensagemErro() {
        return mensagemErro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass()!= o.getClass()) return false;
        Plano plano = (Plano) o;
        return Objects.equals(id, plano.id);
    }

    public boolean validarPlano() {
        if(plano == null || plano.isEmpty()){
            mensagemErro += "O nome do Plano é obrigatorio:";
            isValid = false;
        }
        return isValid;
    }

    }

