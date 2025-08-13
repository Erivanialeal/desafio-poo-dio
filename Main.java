
import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        // instanciando a classe curso
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        // fazendo o mesmo com mentoria
        // instanciado a classe atraves da new
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Develop");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEri = new Dev();
        devEri.setNome("Eri");
        devEri.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Eri" + devEri.getConteudosInscritos());
        devEri.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Eri" + devEri.getConteudosInscritos());
        System.out.println("Conteudos concluidos Eri" + devEri.getConteudosConcluidos());
        System.out.println("XP" + devEri.calcularTotalXp());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());

    }
}