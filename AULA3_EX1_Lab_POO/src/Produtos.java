public class Produtos {

    public int codigoSerie;
    public String codigoProduto;
    public String nome;
    public String categoria;
    public int quantidade;

    public void mostraInfo(){

        System.out.println("Codigo de série do produto: " + codigoSerie);
        System.out.println("Codigo do produto: " + codigoProduto);
        System.out.println("Nome do produto: " + nome);
        System.out.println("Categoria do produto: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }
}
