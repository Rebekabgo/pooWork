package controller;

/**
 *
 * @author bekab
 */

import dao.AlunoDAO;
import model.Aluno;
import util.Validator;
import java.util.Date;
import java.util.List;

public class AlunoController {
    private final AlunoDAO dao;

    public AlunoController(AlunoDAO dao) {
        this.dao = dao;
    }

    public String salvar(String matricula, String nome, String cpf, Date dataNascimento, int idade, String telefone, String genero) {
        if (dao.existsByMatricula(matricula)) return "Erro matricula";
        if (!Validator.isValidCPF(cpf)) return "Erro cpf";
        if (!Validator.isValidPhone(telefone)) return "Erro telefone";
        dao.save(new Aluno(matricula, nome, cpf, dataNascimento, idade, telefone, genero));
        return "Salvo";
    }

    public String inserirNaPosicao(String matricula, String nome, String cpf, Date dataNascimento, int idade, String telefone, String genero, int pos) {
        if (dao.existsByMatricula(matricula)) return "Erro matricula";
        if (!Validator.isValidCPF(cpf)) return "Erro cpf";
        if (!Validator.isValidPhone(telefone)) return "Erro telefone";
        dao.insertAt(new Aluno(matricula, nome, cpf, dataNascimento, idade, telefone, genero), pos);
        return "Salvo";
    }

    public boolean excluir(String matricula) {
        return dao.deleteByMatricula(matricula);
    }

    public Aluno pesquisar(String matricula) {
        return dao.findByMatricula(matricula);
    }

    public List<Aluno> listar() {
        return dao.getAll();
    }

    public Aluno maisNovo() {
        return dao.getMaisNovo();
    }

    public Aluno maisVelho() {
        return dao.getMaisVelho();
    }
}