package DemoPrimeNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter maximum number to find prime");
        int max = s.nextInt();


        System.out.println("Please enter number of prime to find");
        int num = s.nextInt();


        int prime[] = new int[num];

        boolean isPrime = true;
        for (int i = 2; i < max; i++) {
            if (max % i == 0) {
                isPrime = false;
                System.out.println("");
                break;
            }
        }

        System.out.println(prime.length);


    }
}
