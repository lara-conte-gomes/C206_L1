public class Assassino extends Personagem implements LutarComArmas{
    Arma arma;

    //Composição da arma, ao ser criado um assassino cria-se uma arma para ele
    public Assassino(){
        arma = new Arma();
    }

    //método atacar
    public void atacar(Personagem personagem){
        System.out.println("O assassino está atacando o " + personagem.getNome());
        System.out.println("A vida do personagem depois do ataque é: " + (personagem.getVida() - arma.getDano()));
    }
}
