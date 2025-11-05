import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1) 8520  Умовний оператор - 1
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();

        if (x < 5) {
            int x1 = x*x - 3*x + 4;
            System.out.println(x1);
        } else {
            int x2 = x + 7;
            System.out.println(x2);
        }

        // 2) 4817  Прямокутник
        Scanner console = new Scanner(System.in);
        while (console.hasNextInt()) {
            int n = console.nextInt();
            int m = console.nextInt();

            int p = 2 * (n + m);
            int a = n * m;
            System.out.println(p + " " + a);
        }

        // 3) 8954   Вивести масив 2
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        System.out.print(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }


    }
}