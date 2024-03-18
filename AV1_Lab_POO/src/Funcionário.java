public class Funcionário {
    public int matricula;

    public Pessoa pessoa;

    Funcionário(Pessoa nova){
        this.pessoa = nova;
    }

    public void mostrainfo(){
        System.out.println("A matricula do funcionário é: " + this.matricula);
    }
}
