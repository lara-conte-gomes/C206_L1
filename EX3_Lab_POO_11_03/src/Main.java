
public class Main {
    public static void main(String[] args) {
        //criando o restaurante
        Restaurante r = new Restaurante();
        r.cnpj = "123456";
        r.endereco = "Rua Principal";
        r.nome = "Restaurante comida boa";

       //criando o primeiro fornecedor
        r.fornecedor[0] = new Fornecedor();
        r.fornecedor[0].tipo = "Comida";
       r.fornecedor[0].quantidade = 100;

       //criando o segundo fornecedor
       r.fornecedor[1] = new Fornecedor();
       r.fornecedor[1].tipo = "Equipamento";
       r.fornecedor[1].quantidade = 50;

        //chamar o método exibirinfos
        r.exibirinfos();
    }
}