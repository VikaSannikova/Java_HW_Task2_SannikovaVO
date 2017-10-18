package Task2;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "("+ real + ((imag>=0)?"+":"-") + imag +"i)";
    }

    public boolean isReal() {
        if(this.imag==0.0) return true;
        else
            return false;
    }
    public boolean isImaginary()
    {
        if(this.imag!=0.0)return true;
        else
            return false;
    }

    public boolean equals(double real, double imag) {
        if ((this.real==real)&&(this.imag==imag)) return true;
        else
            return false;
    }

    public boolean equals(MyComplex complex) {
        if ((this.real==complex.real)&&(this.imag==complex.imag)) return true;
        else
            return false;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
    }

    public double argument(){
        return Math.atan(this.imag/this.real);
    }

    public MyComplex add(MyComplex right) {
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex result = new MyComplex(this.real+right.real,this.imag+right.imag );
        return result;
    }

    public MyComplex subtract(MyComplex right) {
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right){
        MyComplex result = new MyComplex(this.real-right.real,this.imag-right.imag );
        return result;
    }

    public MyComplex multiply(MyComplex right){
        this.real=this.real*right.real-this.imag*right.imag;
        this.imag=this.real*right.imag+this.imag*right.real;
        return this;
    }

    public MyComplex divide(MyComplex right){
        this.real=(this.real*right.real+this.imag*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        this.imag=(right.real*this.imag-this.real*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        return this;
    }

    public MyComplex conjudate(){
        MyComplex result = new MyComplex(real,-imag);
        return result;
    }

}
