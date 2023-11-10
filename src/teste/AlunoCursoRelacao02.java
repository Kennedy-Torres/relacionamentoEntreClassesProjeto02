package teste;

import dominio.Aluno;
import dominio.Disciplina;
import dominio.Curso;
import dominio.Professor;

public class AlunoCursoRelacao02 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        a1.setNome("Aluno01");
        a2.setNome("Aluno02");
        a3.setNome("Aluno03");


        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        d1.setNome("Estrutura de dados");
        d2.setNome("Estrutura de banco de dados");

        Curso c1 = new Curso();
        Curso c2 = new Curso();
        c1.setNome("Ciências da Computação");
        c2.setNome("ADS");

        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        Professor prof3 = new Professor();
        prof1.setNome("Professor01");
        prof1.setTitulacao("Mestre");
        prof1.setSalario(7000);
        prof2.setNome("Professor02");
        prof2.setTitulacao("Especialista");
        prof2.setSalario(5000);
        prof3.setNome("Professor03");
        prof3.setTitulacao("Especialista");
        prof3.setSalario(4500);

        // muitas disciplinas - muitos cursos
        //Incrementa a disciplina no curso
//        c1.addDisciplinas(d1);
//        c1.addDisciplinas(d2);
//        c2.addDisciplinas(d1);
        d1.addCursos(c1); //-> apagar .... eh equivalente tanto um quanto o outro( a cima , abaixo)
        d1.addCursos(c2);
        d2.addCursos(c1);

        //Uma disciplina - muitos professores
        prof1.setDisciplina(d1);
        prof2.setDisciplina(d2);
        prof3.setDisciplina(d2);

        // muitos cursos - muitos professores
        // Incrementa os cursos nos professores
        prof1.addCursos(c1);
        prof2.addCursos(c1);
        prof3.addCursos(c1);
        prof2.addCursos(c2);
//        c1.addProfessor(prof1); //-> apagar .... eh equivalente tanto um quanto o outro( a cima , abaixo)
//        c1.addProfessor(prof2);
//        c1.addProfessor(prof3);
//        c2.addProfessor(prof2);

        //Um curso - muitos alunos
        a1.setCurso(c1);
        a2.setCurso(c1);
        a3.setCurso(c2);
        a1.setNota(d1,10);
        a1.setNota(d2,9.5);
        a2.setNota(d1,6.4);
        a2.setNota(d2,7.5);
        a3.setNota(d1,7);

        // CURSO -> nome, disciplinas disponíveis no curso, disciplinas ministradas por tais professores
        c1.imprimirCurso();
        c2.imprimirCurso();

        // ALUNO -> nome, curso atual, disciplinas do aluno( disciplinas disponíveis no curso), nota do aluno em cada disciplina
        a1.imprimir();
        a2.imprimir();
        a3.imprimir();

        // PROFESSOR -> nome, titulação, salário , disciplina, contato (telefone, endereço)
        prof1.imprimir();
        prof2.imprimir();
    }
}
