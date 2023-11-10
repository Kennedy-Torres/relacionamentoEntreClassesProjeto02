package dominio;

import java.util.ArrayList;


public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
// ----------------------------------
    private Endereco endereco;
    private Telefone telefone;
    private ArrayList<Telefone> telefones = new ArrayList<>();


// ----------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addTelefone(Telefone telefone){
        telefones.add(telefone);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
