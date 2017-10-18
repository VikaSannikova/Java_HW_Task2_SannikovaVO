package Task2;

public class main {
    public static void main(String[] args) {
        MyComplex complex = new MyComplex(1,2);
        MyComplex complex1 = new MyComplex(1,0);
        MyComplex complex2 = new MyComplex(1,0);
        System.out.println(complex.toString());
        System.out.println(complex1.toString());
        System.out.println("is comp1 real "+complex.isReal());
        System.out.println("is comp2 real "+complex1.isReal());
        System.out.println("is comp1 imag "+complex.isImaginary());
        System.out.println("is comp2 imag "+complex1.isImaginary());
        System.out.println("==? "+complex.equals(complex1));
        System.out.println("==? "+complex1.equals(complex2));
        System.out.println("abs c1"+complex1.magnitude());
        System.out.println("argument c1"+complex1.argument());

        System.out.println("c+c1 "+complex.add(complex1));
        System.out.println("see c"+ complex);
        System.out.println("c-c1 "+complex.subtract(complex1));
        System.out.println("see again c "+complex);
        System.out.println("c+c1 "+complex.addNew(complex1));
        System.out.println("c-c1 "+complex.subtractNew(complex1));
        System.out.println("c*c1 "+complex.multiply(complex1));
        System.out.println("c/c1 "+complex.divide(complex1));
        System.out.println("conj c "+complex.conjudate());


        System.out.println();


        double[] doubleArray = { 1,2,3 };
        double[] doubleArray1 = { 1,0,1};
        MyPolynomial polyCoeffs = new MyPolynomial(doubleArray);
        MyPolynomial polyCoeffs1 = new MyPolynomial(doubleArray1);
        System.out.println("1: "+polyCoeffs.toString());
        System.out.println("2:"+polyCoeffs1.toString());
        System.out.println("+ "+polyCoeffs.add(polyCoeffs1).toString());
        System.out.println("* "+polyCoeffs.multiply(polyCoeffs1).toString());
        System.out.println();




        Ball ball = new Ball(1,1,1,1,-45);
        System.out.println(ball.toString());
        Container cont =  new Container(-2,3,5,4);
        System.out.println("IS IN CONT1? " + cont.collides(ball));
        Container cont1 = new Container(0,1,1,1);
        System.out.println("IS IN CONT2? " + cont1.collides(ball));

        //test!!!!!!!!!!!!!!!!!!!!!!!
    }
}
