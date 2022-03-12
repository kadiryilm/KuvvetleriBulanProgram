import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, initialMultiple_4 = 4, initialMultiple_5 = 5;
        int multiples_4 = 1, multiples_5 = 1;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        do {
            System.out.print(multiples_4 + " ");
            multiples_4 *= initialMultiple_4;
        } while (multiples_4 < num);

        System.out.print("\n");

        do {
            System.out.print(multiples_5 + " ");
            multiples_5 *= initialMultiple_5;
        } while (multiples_5 < num);
    }
}