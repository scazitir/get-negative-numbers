package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers will you type: ");
        int num = scan.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter the value: ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                System.out.println(arr[i]);
            }
        }
        scan.close();
    }
}
