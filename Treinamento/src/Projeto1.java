package Treinamento.src;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Projeto1 {
    //variavel global (static)

    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Login:");
        String senha = JOptionPane.showInputDialog("Senha");

        if (login.equalsIgnoreCase("admin")&& senha.equalsIgnoreCase("admin"));
        {

            //variavel interna
            List<Aluno> alunos = new ArrayList<Aluno>();

            List<Aluno> alunosAprovados = new ArrayList<Aluno>();
            List<Aluno> alunosReprovados = new ArrayList<Aluno>();

            String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            String idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
            String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
            String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno: ");

            //Objeto:
            Aluno aluno2 = new Aluno();

            aluno2.setNome(nome);
            //        aluno2.setCpf(cpf);
            //        aluno2.setDataNascimento(dataNascimento);
            //        aluno2.setRg("365304");
            //        aluno2.setIdade(Integer.valueOf(idade));

            //Disciplinas:
            for (int position = 1; position <= 5; position++) {

                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina " + position + " : ");
                String notaDisciplina = JOptionPane.showInputDialog("Digite a nota " + position + " referente a " + nomeDisciplina);

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.parseDouble(notaDisciplina.replace(",", ".")));

                aluno2.getDisciplinas().add(disciplina);
            }
            for (Aluno aluno : alunos) {
                if (aluno.getAprovacao());

            }
            alunos.add(aluno2);

            //notas:


            //Saida do Sistema:
            System.out.println("Aluno: " + aluno2.getNome());
            System.out.println("Idade: " + aluno2.getIdade());
            System.out.println("Nascimento: " + aluno2.getDataNascimento());
            System.out.println("CPF: " + aluno2.getCpf());
            System.out.println("media das notas é: " + aluno2.getMediaNota());
            System.out.println("Resultado: " + (aluno2.getAprovacao() ? "Aprovado" : "reprovado"));
            System.out.println("Obrigado!");


            //String i =  JOptionPane.showInputDialog("Digite o valor da variave i: ");

            //JOptionPane.showConfirmDialog(null, "bla bla bla?");
            //JOptionPane.showMessageDialog(null, "bla bla bla"+ aluno1+aluno2+aluno3);
        }
    }
}
