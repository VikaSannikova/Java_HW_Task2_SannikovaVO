package Task2;

public class main {
    public static void main(String[] args) {
        double[] doubleArray = { 1,2,3 };
        double[] doubleArray1 = { 1,0,1};
        MyPolynomial polyCoeffs = new MyPolynomial(doubleArray);
        MyPolynomial polyCoeffs1 = new MyPolynomial(doubleArray1);
        System.out.println(polyCoeffs.toString());
        System.out.println(polyCoeffs1.toString());
        System.out.println(polyCoeffs.multiply(polyCoeffs1).toString());
        Ball ball = new Ball(1,1,1,1,-45);
        System.out.println(ball.toString());
        Container cont =  new Container(-2,3,5,4);
        System.out.println("IS IN? " + cont.collides(ball));
        Container cont1 = new Container(0,1,1,1);
        System.out.println("IS IN 1? " + cont1.collides(ball));

        //test!!!!!!!!!!!!!!!!!!!!!!!
    }
}
