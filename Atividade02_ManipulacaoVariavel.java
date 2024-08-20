public class Atividade02_ManipulacaoVariavel {
    public static void main(String[] args) {
        
        String nome = "Renan";
        int idade = 26;
        double salarioBrutoMensal = 5500.00;
        int mesesTrabalhados = 12;
        int quantidadeProdutos = 25;


        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados;
        double desconto = 1500.00;
        double salarioAnualLiquido = salarioAnualBruto - desconto;

        double valorTotalCompras = 1150.00;
        double mediaValorPorProduto = valorTotalCompras / quantidadeProdutos;

        String mensagemPersonalizada = "O salário anual líquido de " + nome + " é R$ " + salarioAnualLiquido;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutos);
        System.out.println("Média de Valor por Produto: R$ " + mediaValorPorProduto);
        System.out.println(mensagemPersonalizada);
