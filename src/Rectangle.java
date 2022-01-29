public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double field() {
        return (a*b);
    }

    @Override
    double circuit() {
        return ((2*a)+(2*b));
    }
}