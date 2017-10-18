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

        //test!!!!!!!!!!!!!!!!!!!!!!!
    }
}
