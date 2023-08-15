package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;
    protected List<Dev> alunosInscritos = new ArrayList<>();

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Dev> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
