package br.com.dio.desafio.dominio;

import java.time.LocalDate;

// classe mentoria é filha da classe Conteudo
public class Mentoria extends Conteudo {
    // criando os atributos da classe com
    // modificadores de acesso privado

    private LocalDate data;

    // criando metado calcular xp
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    // Construtor vazio
    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria[titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

}
