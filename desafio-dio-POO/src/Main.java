import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição BootCamp Java Dev");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devOlavo = new Dev();
        devOlavo.setNome("Olavo");
        devOlavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Olavo" + devOlavo.getConteudosInscritos());
        System.out.println("Conteúdos Incritos Olavo" + devOlavo.getConteudoConcluidos());


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Camila" + devCamila.getConteudosInscritos());



    }
}