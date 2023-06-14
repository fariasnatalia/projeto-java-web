package com.buffet.models;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "comentarios")
public class ComentarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;    

    @Column(nullable = false)
    @Length(min = 1, max = 99999)
    private String texto; 
    
    @Column()
    private Boolean aprovado = false;

    public ComentarioModel(){}

    public ComentarioModel(String nome, String texto, String email){
        this.nome = nome;
        this.texto = texto;
        this.email = email;
    }

    public ComentarioModel(Long id, String nome, String texto, String email, Boolean aprovado){
        this.id = id;
        this.nome = nome;
        this.texto = texto;
        this.email = email;
        this.aprovado = aprovado;
    }

    public Long getId() {
        return this.id;
    }
 
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isAprovado() {
        return this.aprovado;
    }

    public Boolean getAprovado() {
        return this.aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            ", texto='" + getTexto() + "'" +
            ", aprovado='" + isAprovado() + "'" +
            "}";
    }

}
