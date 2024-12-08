/**
 *Classe Aluno representa um aluno com métodos para calcular a média
 * aritmética de suas notas e verificar a aprovação com base na média mínima.
 * @author Kaua Luiz
 */
public class Aluno {
    private String nome;
    
    /**
     * Construtor da classe Aluno
     * 
     * @param nome Nome do aluno.
     */
    public Aluno(String nome) {
        this.nome = nome;
    }
    public double calcularMedia(double nota1, double nota2, double nota3, double nota4){
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
}
