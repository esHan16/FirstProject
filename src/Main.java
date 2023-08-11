// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(n <= 1){
            isPrime = false;
        }
        if(isPrime){
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}