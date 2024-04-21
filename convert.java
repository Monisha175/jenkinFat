public class convert {

    public static void main(String[] args) {
        int number = 7;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
