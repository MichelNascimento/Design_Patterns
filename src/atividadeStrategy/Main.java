package atividadeStrategy;

public class Main {
    public static void main(String[] args) {

        CalculoMedia calc = new CalculoMedia();
        calc.setA(6.3);
        calc.setB(7.5);

        Aritmetica ari = new Aritmetica();

        calc.setIcm(ari);

        System.out.println("Resuktado do calculo " + calc.calculo());




        
    }
    
}
