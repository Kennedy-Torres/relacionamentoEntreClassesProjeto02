package dominio;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private double[] notas;

    //----------------------
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void setNota(Disciplina disciplina, double nota) { //!!!!!!!!!!!!!!!!!!!!
        disciplina.setNota(this, nota);
    }
    public double getNota(Disciplina disciplina){ // !!!!!!!!!!!!!!!!!
        return disciplina.getNota(this);
    }

//    public void setNotas(double[] nota) {
//        this.notas = nota;
//    }

//    public double[] getNotas() {
//        return notas;
//    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;

    }

    public void addDisciplinas(Disciplina disciplina){
        disciplinas.add(disciplina);
    }


    public void imprimir(){
        System.out.println("Nome do aluno: "+getNome());
        System.out.println("Curso atual: "+getCurso().getNome());
        System.out.println("Nota do aluno em cada disciplina: ");
        for (Disciplina disciplina : getCurso().getDisciplinas()) {
            System.out.println("- " + disciplina.getNome()+": Nota = "+getNota(disciplina));
        }

        System.out.println(" ");
    } // devo fazer a herança(Pessoa-Aluno) e colocar o nome, cpf e email do aluno??
}
