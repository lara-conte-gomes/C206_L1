public class Pessoa {
    public String nome;
    public String cpf;
    public int idade;

    public void mostrainfo(){
        System.out.println("O nome do funcionário é: " + this.nome);
        System.out.println("O CPF é: " + this.cpf);
        System.out.println("A idade: " + this.idade);
    }
}
