package Tasks;

import java.util.Scanner;

public class Task09_Odd_evenNumber_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of size");
        int size = sc.nextInt();
        int[] a1 = new int[size];
        System.out.println("Enter array number list");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                a1[i] = sc.nextInt();
            }
        }
            for(int j=0; j < a1.length; j++){
                if(a1[j] % 2 == 0){
                    System.out.println("Even number"+ a1[j]);
                }
                else{
                    System.out.println("Odd number"+ a1[j]);
                }
            }
        }
    }
