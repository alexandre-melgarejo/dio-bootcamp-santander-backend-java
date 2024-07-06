import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição do Curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JS");
    curso2.setDescricao("Descrição do Curso JS");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Curso Java");
    mentoria.setDescricao("Descrição da Mentoria Curso Java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descricao do Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    System.out.println("---");

    Dev dev1 = new Dev();
    dev1.setNome("Primeiro Developer");
    dev1.inscreverBootcamp(bootcamp);
    System.out.println(dev1.getNome() + " - Conteúdo inscrito: " + dev1.getConteudosInscritos());
    dev1.progredir();
    System.out.println(dev1.getNome() + " - Conteúdo inscrito: " + dev1.getConteudosInscritos());
    System.out.println(dev1.getNome() + " - Conteúdo concluído: " + dev1.getConteudosConcluidos());

    System.out.println("---");
    
    Dev dev2 = new Dev();
    dev2.setNome("Segundo Developer");
    dev2.inscreverBootcamp(bootcamp);
    System.out.println(dev2.getNome() + " - Conteúdo inscrito: " + dev2.getConteudosInscritos());
    dev2.progredir();
    dev2.progredir();
    System.out.println(dev2.getNome() + " - Conteúdo inscrito: " + dev2.getConteudosInscritos());
    System.out.println(dev2.getNome() + " - Conteúdo concluído: " + dev2.getConteudosConcluidos());

    System.out.println("---");
    
  }

}
