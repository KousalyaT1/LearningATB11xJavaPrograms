package Tasks;

import java.util.Scanner;

public class Task07_Find2nd_largest_Number_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of size");
        int size= sc.nextInt();
        int[] a1= new int[size];
        System.out.println("Enter array number list");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                a1[i] = sc.nextInt();
            }
        }

        int temp = 0;


        for (int i = 0; i < a1.length-1; i++) {
            for (int j = i+1 ; j <= a1.length-1; j++) {
                if (a1[i] < a1[j]) {
                    temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;

                }
            }
        }
        System.out.println("First Highest number"+ a1[0]);
        System.out.println("Second Highest number"+ a1[1]);
    }
}
