package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    // criando os atributos da classe com
    // modificadores de acesso privado
    private String titulo;
    private String descricao;
    private LocalDate data;

    // Construtor vazio
    public Mentoria() {

    }

    // criando os metados get e set
    public String getTititulo() {
        return titulo;
    }

    public void setTititulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria[titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }

}
