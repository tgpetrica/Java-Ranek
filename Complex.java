public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex suma(Complex c) {
        return new Complex(this.re + c.re, this.im + c.im);
    } 

    public Complex diff(Complex c) {
        return new Complex(this.re - c.re, this.im - c.im);
    } 

    public double modul() {
        return Math.sqrt(re * re + im * im);
    }

    @Override
    public String toString() {
        return re + (im >= 0 ? " + " : " - ") + Math.abs(im) + "i";
    }
    public static void main(String[] args) {
        Complex c = new Complex(); // constructor implicit/default - creat de compilator (javac)
        Complex c1 = new Complex(2, 3);
        System.out.println(c.toString());

        Complex suma = c.suma(c1);
        System.out.println(suma);

        Complex x = new Complex(4.3, 2.9);
        suma = suma.diff(x);
        System.out.println(suma);
    }
}
