public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        final int N = 7;
        int fact = 1;

        for (int i = 1; i <= N; i++) {
            fact *= i;
        }

        System.out.println(fact);
        
    }

}
