package com.academia.powerflex.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 20)
    private String cpf;
    @Column(nullable = false, length = 45)
    private String email;
    @Column(nullable = false, length = 250)
    private String senha;
    @Column(nullable = false, length = 20)
    private String telefone;
    @Column(nullable = false, length = 20)
    private String aula;
    private String dtNascimento;
    private String dtAdmi;
    @Column(nullable = false, length = 100)
    private String endereco;
    @Column(nullable = false, length = 100)
    private String bairro;
    @Column(nullable = false, length = 2)
    private String uf;
    private boolean codStatus;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getDtAdmi() {
        return dtAdmi;
    }

    public void setDtAdmi(String dtAdmi) {
        this.dtAdmi = dtAdmi;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }
    public boolean validarUsuario(){
        return isValid;
    }

}
