public class Restaurante {
    public String cnpj;
    public String endereco;
    public String nome;
    public Fornecedor[] fornecedor;

    public void exibirinfos(){
        for(int i = 0; i < fornecedor.length; i++)
        {
            if(fornecedor[i] != null)
            {
                System.out.println("Tipo do fornecedor: " + fornecedor[i].tipo);
                System.out.println("Quantidade que o fornecedor possui: " + fornecedor[i].quantidade);
                System.out.println("CNPJ do restaurante: " + this.cnpj);
                System.out.println("Endereco do restaurante: " + this.endereco);
                System.out.println("Nome do restaurante: " + this.nome);
            }
        }

    }
}
