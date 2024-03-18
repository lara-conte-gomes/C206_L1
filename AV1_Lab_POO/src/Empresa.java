public class Empresa {
    public String nome;
    public String cnpj;
    public String endereco;
    public int funcionariosDisponiveis;
    public Funcionário[] f = new Funcionário[5];

    public void mostraInfo(){
        System.out.println("O nome da empresa é: " + this.nome);
        System.out.println("O CNPJ dela é: " + this.cnpj);
        System.out.println("O endereço: " + this.endereco);
        System.out.println("O número de funcionários disponíveis: " + this.funcionariosDisponiveis);
    }

    public void adicionarFuncionarios(Funcionário funcionario){
        for(int i = 0; i < f.length; i++)
        {
            if(f[i] == null)
            {
                f[i] = funcionario;
            }
        }
    }

    //index - endereço de memória
    public void alocarFuncionario(int x){
        System.out.println("Funcionário alocado");
        funcionariosDisponiveis --;
    }

    public float contarFuncionariosDisponiveis(){

       float x = funcionariosDisponiveis/f.length;
       return x;
    }
}
