package Tasks;

public class Task02_CLI_14thMarch {
    public static void main(String[] args){
        String userInp1 = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Name:"+ userInp1);
        System.out.println( "Age:"+ age);
        System.out.println("Salary:"+salary);
    }
}
