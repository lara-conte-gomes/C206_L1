
public class Main {
    public static void main(String[] args) {
        //criar o carrinho e colocar os produtos criados dentro dele
        Carrinho carrinho = new Carrinho();

        //criando o produto 1
        carrinho.produtos[0] = new Produto();
        carrinho.produtos[0].nome = "Caixa de som";
        carrinho.produtos[0].descricao = "Objeto para ser levado aonde quiser, pequeno e portátil";
        carrinho.produtos[0].fabricante = "Letron";
        carrinho.produtos[0].preco = 100.40;

        //criando o produto 2
        carrinho.produtos[1] = new Produto();
        carrinho.produtos[1].nome = "Fone de ouvido";
        carrinho.produtos[1].descricao = "Abafa bem o som externo";
        carrinho.produtos[1].fabricante = "JBL";
        carrinho.produtos[1].preco = 200.50;

        //criando o produto 3
        carrinho.produtos[2] = new Produto();
        carrinho.produtos[2].nome = "Notebook";
        carrinho.produtos[2].descricao = "Notebook rápido, com uma boa memória";
        carrinho.produtos[2].fabricante = "Dell";
        carrinho.produtos[2].preco = 2500.78;

        //chamar o método exibirinfos
        carrinho.exibirinfos();

        //chamar o método calculaTotal
        //saída do total da compra
        System.out.println("O total da compra foi: " + carrinho.calculaTotal());
    }
}