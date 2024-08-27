package com.academia.powerflex.model;

import javax.persistence.*;

@Entity
@Table(name = "telefones")
public class Telefone {


       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

       @Column(nullable = false, length = 15)
        private String numero;
        private boolean codStatus;
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

    public String getMensagemErro() {
        return mensagemErro;
    }
    public boolean validarTelefone(){
            return isValid;
    }
}
