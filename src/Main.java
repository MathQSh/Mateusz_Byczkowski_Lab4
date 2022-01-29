import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tab = {0, 1, 2, 3, 4};
        List<Integer> integerList = null;
        try{
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


        try {
            System.out.print(tab[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try{

            integerList.add(2);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try{
            Scanner scanner = new Scanner(System.in);
            scanner.next();
            int a = 2/2;

        } catch (ArithmeticException e ) {
        } catch (InputMismatchException e) {
        } catch (IllegalCallerException e) {

        } finally {
            System.out.println("Dziekuję za ten wspaniały semestr");
        }



    }
}