package passa;
import java.lang.Math;
public class reta{

    
    private float xi;
    private float yi;
    private float xf;
    private float yf;
    private double d = Math.sqrt(Math.pow(xf - xi,2)+Math.pow(yf - yi,2));
    

    public reta(pontos p1, pontos p2) {
        this.xi = p1.getX();
        this.yi = p1.getY();
        this.xf = p2.getX();
        this.yf = p2.getY();   
    }



    public double getD() {
        
        return Math.sqrt(Math.pow(xf - xi,2)+Math.pow(yf - yi,2));
    }



    public float getXi() {
        return xi;
    }



    public float getYi() {
        return yi;
    }



    public float getXf() {
        return xf;
    }



    public float getYf() {
        return yf;
    }



    @Override
    public String toString() {
        return "reta [distancia = " + d + "]";
    }
    
    
    
}
