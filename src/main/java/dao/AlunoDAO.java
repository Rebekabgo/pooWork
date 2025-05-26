package dao;

/**
 *
 * @author bekab
 */

import model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private final List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAll() {
        return new ArrayList<>(alunos);
    }

    public Aluno findByMatricula(String matricula) {
        return alunos.stream()
            .filter(a -> a.getMatricula().equals(matricula))
            .findFirst()
            .orElse(null);
    }

    public boolean existsByMatricula(String matricula) {
        return findByMatricula(matricula) != null;
    }

    public void save(Aluno aluno) {
        alunos.add(aluno);
    }

    public void insertAt(Aluno aluno, int pos) {
        alunos.add(pos, aluno);
    }

    public boolean deleteByMatricula(String matricula) {
        return alunos.removeIf(a -> a.getMatricula().equals(matricula));
    }

    public Aluno getMaisNovo() {
        return alunos.stream().min((a, b) -> Integer.compare(a.getIdade(), b.getIdade())).orElse(null);
    }

    public Aluno getMaisVelho() {
        return alunos.stream().max((a, b) -> Integer.compare(a.getIdade(), b.getIdade())).orElse(null);
    }
}