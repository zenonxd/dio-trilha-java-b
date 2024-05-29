package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO +20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mentoria.class.getSimpleName() + "[", "]")
                .add("titulo='" + getTitulo() + "'")
                .add("descricao='" + getDescricao() + "'")
                .add("data=" + data)
                .toString();
    }
}
