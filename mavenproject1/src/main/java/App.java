import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @authork Kaua Luiz
 * Classe principal para gerenciar dados de alunos e calcular médias.
 */

public class App {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
          System.out.println("Quantos alunos deseja cadastrar?");
          int quantidadeAlunos = Integer.parseInt(scanner.nextLine());
          
          
        // Loop para cadastrar os alunos
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("\nInsira o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite as notas do aluno (separadas por espaço):");
            String[] notasStr = scanner.nextLine().split(" ");
            double[] notas = new double[notasStr.length];
            for (int j = 0; j < notasStr.length; j++) {
                notas[j] = Double.parseDouble(notasStr[j]);
            }
            // Cria o objeto aluno
            Aluno aluno = new Aluno(nome);
            double media = aluno.calcularMedia(notas[0], notas[1], notas[2], notas[3]);
         }
     }
}
