package br.com.dio.desafio.dominio;

import java.util.StringJoiner;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Curso.class.getSimpleName() + "[", "]")
                .add("titulo='" + getTitulo() + "'")
                .add("descricao='" + getDescricao() + "'")
                .add("cargaHoraria=" + cargaHoraria)
                .toString();
    }


}
