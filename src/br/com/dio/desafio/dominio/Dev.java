package br.com.dio.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private final String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private double xp;

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public double getXp() {
        return xp;
    }

    public void inscreverSe(Conteudo conteudo){
        conteudo.alunosInscritos.add(this);
        conteudosInscritos.add(conteudo);

    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudosInclusos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(Conteudo conteudo){
        if(conteudosInscritos.isEmpty()){
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        } else{
            if (conteudosInscritos.contains(conteudo)){
                conteudosInscritos.remove(conteudo);
                conteudosConcluidos.add(conteudo);
                xp += conteudo.calcularXp();
            } else {
                System.err.println("Não matriculado no conteúdo adicionado.");
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Double.compare(xp, dev.xp) == 0 && Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos, xp);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                ", xp=" + xp +
                '}';
    }
}
