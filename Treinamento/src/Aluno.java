package Treinamento.src;

import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    String nome;
    int idade;
    String dataNascimento;
    String rg;
    String cpf;

    List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    //    public Aluno(String nomePadrao) {
//        this.nome = nomePadrao;
//    }
//
//    public Aluno(int idade, String nomePadrao) {
//        nome = nomePadrao;
//        this.idade = idade;
//    }

    public Aluno() {

    }
    //SET Receber dados para atributos
    //GET Obter valores dos atributos


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    //metodo Média Aluno
    public double getMediaNota(){
        double soma = 0;

        for (Disciplina disciplina : disciplinas){
            soma += disciplina.getNota();
        }
        return soma/ disciplinas.size();
    }

    public boolean getAprovacao(){
        double media = this.getMediaNota();
        if (media>=6){
            return true;
        }else{
            return false;
        }
    }
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 6){
            return true;
        }else return false;
    }
//    public String getAlunoAprovado2(){
//        double media = this.getMediaNota();
//        if (media>=6){
//            return StatusAluno.APROVADO;
//        }else{
//            return StatusAluno.REPROVADO;
//        }
//    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return rg.equals(aluno.rg) &&
                cpf.equals(aluno.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rg, cpf);
    }

}
