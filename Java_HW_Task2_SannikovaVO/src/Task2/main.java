package Task2;

public class main {
    public static void main(String[] args) {
        int i =-1;
        String string = "number= "+i;
        System.out.println(string);
        double[] doubleArray = { -1, 2, 3, -4, -5 };
        MyPolynomial polyCoeffs = new MyPolynomial(doubleArray);
        System.out.println(polyCoeffs.toString());
    }
}
