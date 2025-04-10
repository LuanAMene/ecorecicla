package com.tcc.ecoplus.ecorecicla.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PessoaJuridica")
@Data
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 45)
    private long cnpj;
    @Column(nullable = false, length = 45)
    private String nome;
    private String ramo;
    @Column(nullable = false, length = 20)
    private String num;
    @Column(nullable = false, length = 10)
    private String cep;
    @Column(nullable = false, length = 6)
    private String email;
    @Column(nullable = false, length = 100)
    private String telefone;
    @Column(nullable = true, length = 13)
    private String senha;
    private boolean codstatus;

    @Transient
    @JsonIgnore
    private String mensagemError = "";

    @Transient
    @JsonIgnore
    private boolean isValid = true;

    public boolean validarPessoaJuridica() {
        return isValid;
    }

}
