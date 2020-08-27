import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        BigInteger num1 = scan.nextBigInteger();

        System.out.println("Enter number 2: ");
        BigInteger num2 = scan.nextBigInteger();


        System.out.println();
        System.out.println();

        Multiplication m = new Multiplication();

        System.out.println("BigInteger class: " + m.multiplicationUsingBigIntegerClass(num1, num2));
        System.out.println("Implemented algorithm: " + m.multiplicationAlgorithmFromScrach(num1, num2));






        scan.close();
    }

}
