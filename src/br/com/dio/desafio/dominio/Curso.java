package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int caragaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * caragaHoraria;
    }

    public Curso() {
    }

    public int getCaragaHoraria() {
        return caragaHoraria;
    }

    public void setCaragaHoraria(int caragaHoraria) {
        this.caragaHoraria = caragaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", caragaHoraria=" + caragaHoraria +
                '}';
    }


}
