public class Cliente {
    private String nome;
    private long cpf;

    public String setnome(String nome){
        this.nome = nome;

        return this.nome;
    }

    public String getnome(){
        return this.nome;
    }

    public long setcpf(long cpf){
        this.cpf = cpf;

        return this.cpf;
    }

    public long getcpf(){
        return this.cpf;
    }

}
