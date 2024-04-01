
public class Main {
    public static void main(String[] args) {
        Produto[] p = new Produto[4];

        Produto n1 = new Notebook("Dell", 1200.20, 16.8, "onboard", "AMD Ryzen 5 3500U: Série 3000");
        Produto n2 = new Notebook("Samsung", 2000.10, 20.5, "offboard", "AMD Ryzen 5 4500U: Série 4000");
        Produto c1 = new Camiseta("Hering", 20.50, "Azul", "M");
        Produto c2 = new Camiseta("Forever 21", 15.90, "Branco", "P");

        p[0] = n1;
        p[1] = n2;
        p[2] = c1;
        p[3] = c2;

        for(int i = 0; i < p.length; i++){
            if(p[i] != null){
                if(p[i] instanceof Notebook){
                    Notebook no = (Notebook)p[i];
                    no.etiquetaPreco();
                }
                else if(p[i] instanceof Camiseta){
                    Camiseta ca = (Camiseta)p[i];
                    ca.etiquetaPreco();
                }
            }
        }
    }
}