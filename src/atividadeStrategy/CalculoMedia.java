package atividadeStrategy;

public class CalculoMedia {
    private ICalcMedia Icm;

    private double a;
    private double b;

    public void setIcm(ICalcMedia icm){
        Icm = icm;
    }
    public ICalcMedia getIcm(){
        return Icm;
    }

    public void setA(Double a){
        this.a = a;
    }
    public double getA(){
        return a;
    }

    public void setB(Double b){
        this.b = b;
    }

    public double getB(){
        return b;
    }

    public double calculo(){
        return this.Icm.CalculaMedia(this.a, this.b);
    }

    
}
