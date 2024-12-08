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
    /**
     * Calcula a média aritmética de quatro notas.
     *
     * @param nota1 Primeira nota do aluno.
     * @param nota2 Segunda nota do aluno.
     * @param nota3 Terceira nota do aluno.
     * @param nota4 Quarta nota do aluno.
     * @return A média aritmética das quatro notas.
     */
    public double calcularMedia(double nota1, double nota2, double nota3, double nota4){
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
     /**
     * Verifica se o aluno foi aprovado ou reprovado com base na média.
     *
     * @param media A média calculada do aluno.
     * @return "Aprovado" se a média for maior ou igual a 6.0, caso contrário, "Reprovado".
     */
    public String verificarAprovacao(double media) {
        return media >= 6.0 ? "Aprovado" : "Reprovado";
    }
    /**
     * Retorna o nome do aluno.
     * 
     * @return nome do aluno
     */
    public String getNome() {
        return nome;
    }
}
