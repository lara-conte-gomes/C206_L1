public class Conta {
    private static int qtdClientes;
    private double saldo;
    Cliente c1 = new Cliente();

    public Conta(){
        qtdClientes++;
    }

    public static int getqtdClientes(){
        return qtdClientes;
    }

    public double setsaldo(double valor){
        this.saldo = valor;

        return this.saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void extrato(){
        System.out.println("O saldo da conta é: " + this.saldo);
    }
}
