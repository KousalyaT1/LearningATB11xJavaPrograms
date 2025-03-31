package Tasks;

import java.util.Scanner;

public class Task05_EvenOdd_14March {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        if(number % 2 == 0)
            System.out.println("It is Even number");
        else
            System.out.println("It is Odd number");
        scanner.close();
    }
}
