public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Pole: "+ square.field()+ " Obwód: "+ square.circuit());
        System.out.println("Pole: "+rectangle.field()+ " Obwód: "+ rectangle.circuit());
    }
}