package com.buffet.dtos;

public class AtualizarComentarioDTO {
    private Long id;

    private String nome;

    private String texto;

    private String email;

    private Boolean aprovado;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
