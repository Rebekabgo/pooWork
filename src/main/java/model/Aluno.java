package model;

/**
 *
 * @author bekab
 */

import java.util.Date;

public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private int idade;
    private String telefone;
    private String genero;

    public Aluno(String matricula, String nome, String cpf, Date dataNascimento, int idade, String telefone, String genero) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.telefone = telefone;
        this.genero = genero;
    }

    // Getters e setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public Date getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(Date dataNascimento) { this.dataNascimento = dataNascimento; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}