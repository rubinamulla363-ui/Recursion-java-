import java.util.Scanner;

public class Recursion {

    static int reverseNumber(int n, int rev) {

        if (n == 0) {
            return rev;
        }

        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = reverseNumber(num, 0);

        System.out.println("Reversed number = " + result);
    }
}