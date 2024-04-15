public abstract class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int poder;

    //método usar habilidade
    public void usarHabilidade(){
        System.out.println("O personagem está usando uma habilidade.");
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getPoder() {
        return poder;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
