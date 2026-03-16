package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criando Cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Fundamentos da linguagem Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("JavaScript Frontend");
        cursoJS.setDescricao("ES6+, DOM e manipulação de eventos");
        cursoJS.setCargaHoraria(4);

        // Criando Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tire suas dúvidas com um especialista");
        mentoria.setData(LocalDate.now());

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Torne-se um desenvolvedor Java completo!");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria);

        // Criando Devs e inscrevendo
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);

        // Pedro progride em 2 conteúdos
        System.out.println("===== Pedro =====");
        System.out.println("Inscritos: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Concluídos: " + devPedro.getConteudosConcluidos());
        System.out.println("XP Total: " + devPedro.calcularTotalXp());

        // Ana progride em 1 conteúdo
        System.out.println("\n===== Ana =====");
        devAna.progredir();
        System.out.println("Concluídos: " + devAna.getConteudosConcluidos());
        System.out.println("XP Total: " + devAna.calcularTotalXp());
    }
}