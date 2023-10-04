public class Main {
    public static void main(String[] args) {

        System.out.println("Деление чисел");
        Fraction fraction = new Fraction(10,100);
        fraction.PrintFraction(fraction);

        fraction.setNumerator(1000);
        fraction.setDenominator(5);
        fraction.PrintFraction(fraction);
    }
}
class Fraction {
    private double numerator;
    private double denominator;

    // get method
    public double getNumerator () {
        return numerator;
    }
    public double getDenominator() {
        return denominator;
    }
    public double getResult () {
        return numerator / denominator;
    }
    // set method
    public void setNumerator (double numerator) {
        this.numerator = numerator;
    }
    public void setDenominator (double denominator) {
        if(denominator == 0) denominator = 1;
        this.denominator = denominator;
    }
    public Fraction (double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void PrintFraction (Fraction fraction) {
        System.out.println("Результат деления чисел: %.2f".formatted (fraction.getResult()));
    }

}