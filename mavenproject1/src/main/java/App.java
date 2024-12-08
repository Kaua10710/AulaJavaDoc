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
      }
}
