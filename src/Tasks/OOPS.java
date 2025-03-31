package Tasks;

public class OOPS {
    public static void main(String[] args){
    Person p = new Person();
        System.out.println(p.A);
        p.B1();
        int otp1 = p.B2();
        System.out.println(otp1);
        p.B3(45);
        int otp2 = p.B4(78);
        System.out.println(otp2);
    }
    static class Person{
        int A = 10;

        public  void B1(){
            System.out.println(A);
        }
        public  int B2(){
            return A;
        }
        public  void B3(int A){
            System.out.println(A);
        }
        public int B4(int A){
            return A;
        }
    }
}
