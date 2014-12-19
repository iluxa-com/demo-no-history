/*
This is fibonacchi function
1
2
3
4
45
56
7
68
78
8
890
789
789
89
-9

 */


public class Fibonacci {
    //some comments added
    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
        //some comments added
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++)
            System.out.println(i + ": " + fib(i));


    }

}