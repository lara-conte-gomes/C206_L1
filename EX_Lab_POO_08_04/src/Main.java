
public class Main {
    public static void main(String[] args) {
        Carro s = new Sedan(1000, "Azul", 2010);

        s.mostrainfo();
        s.taxa();

        if(s instanceof Sedan){
            Sedan s1 = (Sedan) s;
            s1.setPortaMalas(2);
            System.out.println("A quantidade de portas do SEDAN é: " + s1.getPortaMalas());
        }

        Carro suv = new SUV(2000, "Vermelho", 2022);

        suv.mostrainfo();
        suv.taxa();

        if(suv instanceof SUV){
            SUV s2 = (SUV) suv;
            s2.setTracao("Dianteiro");
            System.out.println("A tração do SUV: " + s2.getTracao());
        }

        Carro hatch = new Hatch(5000, "Roxo", 2025);

        hatch.mostrainfo();
        hatch.taxa();

        if(hatch instanceof Hatch){
            Hatch h = (Hatch) hatch;
            h.setPortas(4);
            System.out.println("O Hatch possui " + h.getPortas() + " portas.");
        }


    }
}