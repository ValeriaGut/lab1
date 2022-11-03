import java.util.Scanner;
import java.text.*;
public class Pr{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input x:\n");
        float x = scan.nextFloat();
        System.out.println("Input k:\n");
        int k = scan.nextInt();
        Teylor t = new Teylor(x, k);
        t.findRow();
    }
}


