public class Main {

    public static void main(String[] args) {

        final int N = 7;
        int fact = 1;

        for (int i = 1; i <= N; i++) {
            fact *= i;
        }

        System.out.println(fact);

        int num = 5239;
        int sum = 0;

        while (num != 0) {
            int divide = num % 10;
            sum += divide;
            num = num / 10;
        }

        System.out.println(sum);

    }

}
