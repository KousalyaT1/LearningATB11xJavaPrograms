package Tasks;

public class Task03_Decrement_14thMarch {
    public static void main(String[] args){
        String userInp1 = args[0];
        String userInp2 = args[1];
        int num1 = Integer.parseInt(userInp1);
        int num2 = Integer.parseInt(userInp2);
        int result = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum number is " + result);
    }
}
