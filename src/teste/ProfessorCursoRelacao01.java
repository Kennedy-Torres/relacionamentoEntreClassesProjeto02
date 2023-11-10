package teste;

import dominio.Curso;
import dominio.Professor;

public class ProfessorCursoRelacao01 {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        Professor prof3 = new Professor();
        prof1.setNome("Professor01");
        prof1.setSalario(7000);
        prof1.setTitulacao("Mestre");
        prof2.setNome("Professor02");
        prof2.setSalario(5000);
        prof2.setTitulacao("Especialista");
        prof3.setNome("Professor03");
        prof3.setSalario(4500);
        prof3.setTitulacao("Especialista");


        Curso c1 = new Curso();
        Curso c2 = new Curso();
        Curso c3 = new Curso();
        c1.setNome("Curso01");
        c2.setNome("Curso02");
        c3.setNome("Curso03");

        // INCREMENTA O CURSO NO PROFESSOR
//        prof1.addCursos(c1);
//        prof1.addCursos(c2);
//        prof2.addCursos(c1);
//        prof2.addCursos(c3);
//        prof3.addCursos(c2);
//        prof3.addCursos(c3);
//        prof1.imprimir();
//        prof2.imprimir();
//        prof3.imprimir();



        // INCREMENTA O PROFESSOR NO CURSO
        c1.addProfessor(prof1);
        c1.addProfessor(prof2);
        c2.addProfessor(prof3);
        c1.imprimirCurso();
        c2.imprimirCurso();



    }
}
