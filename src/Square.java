public class Square extends Figure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    double field() {
        return (a*a);
    }

    @Override
    double circuit() {
        return (4*a);
    }
}