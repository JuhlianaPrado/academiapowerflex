package com.academia.powerflex.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telefone_aluno")
public class Telefone {


       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

       @Column(nullable = false, length = 15)
        private String numero;
        private boolean codStatus;

    @ManyToOne (cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_aluno", referencedColumnName = "id", nullable = false)
    private Aluno aluno;
        @Transient
        private String mensagemErro = "";
        @Transient
        private boolean isValid = true;

    public Telefone(Aluno aluno) {
        this.aluno = aluno;
    }

    public Telefone() {

    }

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public boolean isCodStatus() {
            return codStatus;
        }

        public void setCodStatus(boolean codStatus) {
            this.codStatus = codStatus;
        }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }
    public boolean validarTelefone(){
            return isValid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass()!= o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(id, telefone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
