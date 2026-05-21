public class Recursion {

    static int countFactors(int n, int i) {

        if (i > n) {
            return 0;
        }

        if (n % i == 0) {
            return 1 + countFactors(n, i + 1);
        } else {
            return countFactors(n, i + 1);
        }
    }

    public static void main(String[] args) {

        int num = 12;

        int result = countFactors(num, 1);

        System.out.println("Number of factors = " + result);
    }
}