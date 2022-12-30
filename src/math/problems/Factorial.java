package math.problems;

public class Factorial {

    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }

        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        int x= 10;
        int result = factorial(x);
        System.out.println(x + "! = " + result);
    }
}
