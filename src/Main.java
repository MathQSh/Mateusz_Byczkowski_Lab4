import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index = 0;
        boolean isIndexCorrect = false;
        String[] tab = {"Mateusz", "Marek", "Marzena", "Krzyś", "Daniel", "Mirek"};
        Scanner scan = new Scanner(System.in);

        try {
            Integer str = null;
            while(!isIndexCorrect){
                str = Integer.parseInt(scan.next());
                isIndexCorrect = valid(str);
            }

            index = str;

        }
        catch(NumberFormatException e){
            System.out.println("Cannot parse the string to integer");

        }
        finally{
            if(isIndexCorrect) System.out.println(tab[index]);
        }
    }
    public static boolean valid(Integer a) {
        return (a < 6) && (a >= 0);
    }

}