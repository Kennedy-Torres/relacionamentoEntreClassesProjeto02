package dominio;

import java.util.ArrayList;

public class Curso {
    private String nome;
    //--------------------
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //get do array
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void addProfessor(Professor professor){
        //professor.addCursos(this); pq não posso ter ???????????????????????????
        professores.add(professor);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplinas(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void imprimirCurso(){
        System.out.println("Nome do curso: "+getNome());
        System.out.println("Disciplinas disponíveis: ");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- "+ disciplina.getNome());

            System.out.println("Professores associados à disciplina " + disciplina.getNome() + ":");
            for (Professor professor : professores) {
                if (professor.getDisciplina() == disciplina) {
                    System.out.println("  - " + professor.getNome());
                }
            }
        }
        System.out.println(" ");
    }
}
