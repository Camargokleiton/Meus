package passa;

public class quadrado extends poliedro {

    private reta r;
   

    public quadrado(reta r) {
        this.r = r;
    }

    public double getArea() {
        return Math.pow(r.getD(),2);
    }

    @Override
    public double perimetro(reta reta_dada,abstract int n) {
         n = 4;
        return super.perimetro(reta_dada, n);
    }

    
    
}
