import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Деление чисел");
        Fraction fraction = new Fraction(10,100);
        fraction.PrintFraction(fraction);

        fraction.setNumerator(1000);
        fraction.setDenominator(5);
        fraction.PrintFraction(fraction);

        Point point = new Point(2,3);
        Point otherPoint = new Point(7,8);
        System.out.println("Расстояние: " + point.distance(otherPoint));
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
class Point {
        private double x;
        private double y;
        public Point (double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double distance (Point other) {
            return Math.sqrt(Math.pow(other.x,2) + Math.pow(other.y,2));
        }
    public void PrintPoint () {
        System.out.println("X = %f, Y = %f".formatted(x,y));
    }

}
}