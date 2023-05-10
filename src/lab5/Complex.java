package lab5;

public class Complex {
    private final double real;
    private final double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex addition(Complex complex) {
        double real = this.real + complex.real;
        double imag = this.imag + complex.imag;
        return new Complex(real, imag);
    }

    public Complex subtraction(Complex complex) {
        double real = this.real - complex.real;
        double imag = this.imag - complex.imag;
        return new Complex(real, imag);
    }

    public Complex multiplication(Complex complex) {
        double real = this.real * complex.real - this.imag * complex.imag;
        double imag = this.real * complex.imag + complex.real * this.imag;
        return new Complex(real, imag);
    }

    public Complex division(Complex complex) {

        double a = this.real;
        double b = this.imag;
        double c = complex.real;
        double d = complex.imag;

        double real = (a * c + b * d) / (c * c + d * d);
        double imag = (b * c - a * d) / (c * c + d * d);
        return new Complex(real, imag);
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}
