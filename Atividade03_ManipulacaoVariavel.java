import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {
    public static void main(String[] args) {
        
        String nomeProduto = "Notebook"; 
        double precoUnitario = 4500.00;
        int quantidadeComprada = 10;
        double taxaImposto = 0.25;
        double margemLucro = 0.30;


        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
        
        double precoVenda = valorTotalComImpostos * (1 + margemLucro);

        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");
        String valorTotalComImpostosFormatado = formatoMoeda.format(valorTotalComImpostos);
        String precoVendaFormatado = formatoMoeda.format(precoVenda);

        String mensagemFinal = "Produto: " + nomeProduto + 
                               "\nValor Total com Impostos: " + valorTotalComImpostosFormatado + 
                               "\nPreço de Venda Sugerido: " + precoVendaFormatado;

        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: " + formatoMoeda.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Valor Total Sem Impostos: " + formatoMoeda.format(valorTotalSemImpostos));
        System.out.println("Valor do Imposto: " + formatoMoeda.format(valorImposto));
        System.out.println("Valor Total Com Impostos: " + valorTotalComImpostosFormatado);
        System.out.println("Preço de Venda Sugerido: " + precoVendaFormatado);
        System.out.println("\n" + mensagemFinal);
