public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    //GETTERS
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(valor < (saldo + limite)){
            this.saldo -= valor;
            System.out.println("Novo saldo: " + this.saldo);
        }
        else{
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

    }
}
