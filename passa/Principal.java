package passa;

public class Principal {
    public static void main(String[] args) {
        pontos p1 = new pontos(1, 2);
        pontos p2 = new pontos(1, 12);
        reta r1 = new reta(p1,p2);
        quadrado quad = new quadrado(r1);

        System.out.println("p1 = ("+p1.getX()+","+p1.getY()+")"+
        "p2 = ("+p2.getX()+","+p2.getY()+")" );

        System.out.println("pontos da reta :\np1.x = " + r1.getXi()+ "\np1.y = " + r1.getYi()+"\np2.x = "+ r1.getXf()+ "\np2.y = " + r1.getYf());
        System.out.println("distancia r1 = "+ r1.getD());
        System.out.println("area do quadrado = "+quad.getArea());
        System.out.println("perimetro");

    }
}
