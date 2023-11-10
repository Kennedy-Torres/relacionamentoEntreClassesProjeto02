package dominio;

import java.util.ArrayList;

public class Professor extends Pessoa { //herança Pessoa(pai) -> Professor(filho)
    private String titulacao;
    private double salario;
    //----------------------------------
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Disciplina disciplina;


    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Disciplina getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public ArrayList<Curso> getCursos(){
        return cursos;
    }

    public void addCursos(Curso curso){
        curso.addProfessor(this);
        cursos.add(curso);
    }

    public void imprimir(){
        System.out.println("Nome do professor: "+getNome()+ // eh certo fazer isso????? to puxando o nome da pessoa q por sua vez é professor.... não teria q fazer um super e trazer o nome apenas para professor?
                            "\nSalário: "+getSalario()+
                            "\nTitulação: "+getTitulacao());
        if (disciplina != null) {
            System.out.println("Disciplina Ministrada: " + disciplina.getNome());
        } else {
            System.out.println("Nenhuma disciplina ministrada pelo professor.");
        }

        System.out.println("Cursos associados:");
//        for (Curso curso : cursos) {
//                System.out.println("  - " + disciplina.getNome());
//
//        }
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("  - " + cursos.get(i).getNome());
        }

        System.out.println(" ");
        System.out.println("FALTA INSERIR O RESTO DOS DADOS");
        System.out.println(" ");
    }
}
