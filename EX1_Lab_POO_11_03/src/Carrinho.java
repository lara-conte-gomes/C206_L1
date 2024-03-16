public class Carrinho {

    public double total = 0;
    public Produto[] produtos = new Produto[4];

    //método exibirinfos
    public void exibirinfos(){
        for(int i = 0; i < produtos.length; i++)
        {
            if(produtos[i] != null)
            {
                System.out.println("Nome do produto: " + produtos[i].nome);
                System.out.println("Descrição do produto: " + produtos[i].descricao);
                System.out.println("Fabricante: " + produtos[i].fabricante);
                System.out.println("Preço: " + produtos[i].preco);
            }
        }
    }
    //método calculaTotal
    public double calculaTotal(){
        for(int i = 0; i < produtos.length; i++)
        {
            if(produtos[i] != null)
            {
                total += produtos[i].preco;
            }
        }
        return total;
    }
}
