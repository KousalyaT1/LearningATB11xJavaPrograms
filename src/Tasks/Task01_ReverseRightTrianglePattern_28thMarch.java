package Tasks;

import java.util.Scanner;

public class Task01_ReverseRightTrianglePattern_28thMarch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number e.g n=3");
        int n = sc.nextInt();
        for(int i =n; i > 0; i--){
            for(int j =0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
