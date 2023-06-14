package com.buffet.dtos;

public class SalvarComentarioDTO {
    private String nome;

    private String texto;

    private String email;

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



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", texto='" + getTexto() + "'" +
            "}";
    }

}
