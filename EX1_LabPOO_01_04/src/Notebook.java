public class Notebook extends Produto{
    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador){
        this.setnome(nome);
        this.setpreco(preco);
        this.setarmazenamento(armazenamento);
        this.setgpu(gpu);
        this.setprocessador(processador);
    }
    public void setarmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setgpu(String gpu) {
        this.gpu = gpu;
    }

    public void setprocessador(String processador) {
        this.processador = processador;
    }

    @Override
    public void etiquetaPreco(){
        super.etiquetaPreco();
        System.out.println("O armazenamento é: " + this.armazenamento);
        System.out.println("O GPU é: " + this.gpu);
        System.out.println("O processador é: " + this.processador);
    }
}
