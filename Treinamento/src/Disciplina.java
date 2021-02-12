package Treinamento.src;

import java.util.Objects;

public class Disciplina {

    String disciplina;
    double nota;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina that = (Disciplina) o;
        return Double.compare(that.getNota(), getNota()) == 0 &&
                getDisciplina().equals(that.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDisciplina(), getNota());
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "disciplina='" + disciplina + '\'' +
                ", nota=" + nota +
                '}';
    }
}

