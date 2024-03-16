public class Empresa {
    public String cnpj;
    public String endereco;
    public Contato[] contatos = new Contato[3];

    public void exibirinfos(){
        for(int i = 0; i < contatos.length; i++)
        {
            if(contatos[i] != null)
            {
                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("Email: " + contatos[i].email);
                System.out.println("Telefone: " + contatos[i].telefone);
                System.out.println("Data de nascimento: " + contatos[i].dataNascimento);
            }
        }
        System.out.println("CNPJ da empresa: " + this.cnpj);
        System.out.println("Endereço da empresa: " + this.endereco);
    }
}
