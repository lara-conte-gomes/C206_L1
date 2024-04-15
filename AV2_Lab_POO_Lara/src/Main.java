
public class Main {
    public static void main(String[] args) {
        //criando a lista de personagens para armazenar o assassino, o mago e o guerreiro
        Personagem[] p = new Personagem[3];

        //criando o assassino, o mago e o guerreiro
        Personagem assassino1 = new Assassino();
        Personagem mago1 = new Mago();
        Personagem guerreiro1 = new Guerreiro();

        //colocando as informações do assassino
        assassino1.setNome("Assassino X");
        assassino1.setVida(500);
        assassino1.setEnergia(1000);
        assassino1.setPoder(800);

        //guardando no Array, lista
        p[0] = assassino1;

        //colocando as informções do mago
        mago1.setNome("Merlin");
        mago1.setVida(1000);
        mago1.setEnergia(1500);
        mago1.setPoder(2000);

        //guardando no Array, lista
        p[1] = mago1;

        //colocando as informções do guerreiro
        guerreiro1.setNome("Aslen");
        guerreiro1.setVida(700);
        guerreiro1.setEnergia(1200);
        guerreiro1.setPoder(1000);

        //guardando no Array, lista
        p[2] = guerreiro1;

        //mostrando as informações de cada personagem
        for(int i = 0; i < p.length; i++){
            if(p[i] instanceof Assassino){
                Assassino a1 = (Assassino) assassino1;

                //mostrando as informações do assassino
                System.out.println("O nome do assassino é: " + a1.getNome());
                System.out.println("A vida do assassino antes do ataque é: " + a1.getVida());
                System.out.println("A energia do assassino é: " + a1.getEnergia());
                System.out.println("O Poder do assassino é: " + a1.getPoder());

                //colocando um nome e um valor de dano na arma do assassino
                a1.arma.setNome("Lâmina");
                a1.arma.setDano(200);

                //mostrando o nome e o dano da arma do assassino
                System.out.println("Nome da arma do assassino: " + a1.arma.getNome());
                System.out.println("Dano da arma do assassino: " + a1.arma.getDano());

                //assassino ataca o mago, chamando o método atacar e enviando os dados do mago para o método
                a1.atacar(mago1);
            }

            else if(p[i] instanceof Mago){
                Mago m1 = (Mago) mago1;

                //mostrando as informações do mago
                System.out.println("O nome do mago é: " + m1.getNome());
                System.out.println("A vida do mago antes do ataque é: " + m1.getVida());
                System.out.println("A energia do mago é: " + m1.getEnergia());
                System.out.println("O Poder do mago é: " + m1.getPoder());

                //chamando o método usar Habilidade do mago
                m1.usarHabilidade();
            }

             else if(p[i] instanceof Guerreiro){
                Guerreiro g1 = (Guerreiro) guerreiro1;

                //mostrando as informações do guerreiro
                System.out.println("O nome do guerreiro é: " + g1.getNome());
                System.out.println("A vida do guerreiro antes do ataque é: " + g1.getVida());
                System.out.println("A energia do guerreiro é: " + g1.getEnergia());
                System.out.println("O Poder do guerreiro é: " + g1.getPoder());

                //colocando um nome e um dano na arma do guerreiro
                g1.arma.setNome("Escalibur");
                g1.arma.setDano(500);

                //mostrando o nome e o dano da arma do guerreiro
                System.out.println("Nome da arma do guerreiro: " + g1.arma.getNome());
                System.out.println("Dano da arma do guerreiro: " + g1.arma.getDano());

                //guerreiro ataca o assassino, chamando o método atacar e enviando os dados do assassino para o método
                g1.atacar(assassino1);
            }
        }
    }
}