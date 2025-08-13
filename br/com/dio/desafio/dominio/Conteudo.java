package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    /*
     * criando uma constante que é uma váriavel cujo valores
     * não podem ser alterados depois de definidos usamos a
     * palavra reservada final
     * usamos o static para poder acessar fora da classe padrão
     */
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // criar o metado calcular XP abstrato
    public abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
