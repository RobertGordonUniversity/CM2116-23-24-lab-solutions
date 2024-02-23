package lab4;

public class App {
    public static void main(String[] args) {
        
    }

    /* Fibonacci tasks */

    static int fibonacci(int n) {
        if (n <= 2) {
            return n - 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int iterativeFib(int n) {
        if (n <= 2) {
            return n - 1;
        }

        int result = 0, oneBack = 1, twoBack = 0;

        for (int i = 1; i < n - 1; i++) {
            result = oneBack + twoBack;
            twoBack = oneBack;
            oneBack = result;
        }
        return result;
    }
}
