package Task2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return coeffs.length-1;
    }

    @Override
    public String toString() {
        String polynom = "";
        for (int i = coeffs.length - 1; i >= 0; --i) {
            if (coeffs[i] != 0.0) { // заведомо нулевые не выводим
                if (i == 0){
                    if(coeffs[i]>0) polynom+='+';
                    polynom += coeffs[i];
                }
                else if (i == 1) {
                    if(coeffs[i]>0) polynom+='+';
                    polynom += coeffs[i] + "x";
                }
                else if(i==coeffs.length -1){
                    polynom +=coeffs[i] + "x^" + i;
                }
                else{
                    if(coeffs[i]>0) polynom+='+';
                    polynom +=coeffs[i] + "x^" + i;}

            }
        }
        return polynom;
    }

    public double evaluate(double x){
        double result=0;
        for(int i= coeffs.length-1;i>=0;i--)
        {
            result+=coeffs[i]*Math.pow(x,i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right)
    {
        int deg=Math.max(this.getDegree(),right.getDegree());
        double[] newCoeffs = new double[deg+1];
        for (int i=0;i<=deg;i++)
        {
            newCoeffs[i]=0.0;
            if(i<=this.getDegree()) newCoeffs[i]+=this.coeffs[i]; //добавляем в ячейку массива значение из соответствующей ячейки this
            if(i<=right.getDegree()) newCoeffs[i]+=right.coeffs[i];
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right){
        int deg=this.getDegree()+right.getDegree();
        double[] newCoeffs = new double[deg+1];
        for(int i=0;i<=this.getDegree();i++)
        {
            for(int j = 0; j <=right.getDegree(); j++) {
                newCoeffs[i+j]+=this.coeffs[i]*right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

}
