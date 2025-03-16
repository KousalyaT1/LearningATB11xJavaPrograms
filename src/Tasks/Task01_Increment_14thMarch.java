package Tasks;

public class Task01_Increment_14thMarch {
    public static void main(String[] args) {
    int a = 10;
    System.out.println(++a + a++ + a++);
    System.out.println(a);
    // ExpA -> 11, a->11
    // +
    // ExpB -> 11, a -> 12
    // +
    // ExpC -> 12, a -> 13
    // ist system out : ExpA+ExpB+ExpC => 11+11+12 =34
    // 2nd system out: 13
    }
}
