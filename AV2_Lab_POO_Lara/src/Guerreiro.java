public class Guerreiro extends Personagem implements LutarComArmas{
    Arma arma;

    //Composição da arma, ao ser criado um guerreiro cria-se uma arma para ele
    public Guerreiro(){
        arma = new Arma();
    }

    //método atacar
    public void atacar(Personagem personagem){
        System.out.println("O Guerreiro está atacando o " + personagem.getNome());
        System.out.println("A vida do personagem depois do ataque é: " + (personagem.getVida() - arma.getDano()));
    }
}
