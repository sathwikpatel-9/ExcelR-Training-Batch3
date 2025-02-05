class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20;
        long first = 0, second = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
    }
}
