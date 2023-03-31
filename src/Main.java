import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso ();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCaragaHoraria(8);

        Curso curso2 = new Curso ();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso js");
        curso2.setCaragaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java!");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos" + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devAndre.getConteudosConcluidos());
        System.out.println("XP = " + devAndre.calcularXp());

        System.out.println("-------------------");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devFelipe.getConteudosInscritos());
        System.out.println(" - ");
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("Conteúdos Inscritos" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devFelipe.getConteudosConcluidos());
        System.out.println("XP = " + devFelipe.calcularXp());
    }
}