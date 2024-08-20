// Atividade01_ManipulacaoVariavel.java

public class Atividade01_ManipulacaoVariavel {
    public static void main(String[] args) {
        
        int idade = 26;
        double altura = 1.75;
        String nome = "Renan";
        boolean estudante = true;
      
        int idade2 = 26;
        int somaIdades = idade + idade2;
        double alturaDobrada = altura * 2;
        String saudacao = "Olá, " + nome + "!"; 
      
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("Estudante? " + estudante);
        System.out.println("Soma das Idades: " + somaIdades);
        System.out.println("Altura Dobrada: " + alturaDobrada);
        System.out.println(saudacao);
