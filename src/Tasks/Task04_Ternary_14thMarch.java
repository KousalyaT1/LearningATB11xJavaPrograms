package Tasks;

public class Task04_Ternary_14thMarch {
    public static void main(String[] args){
        int a = 20;
        System.out.println(--a + a++ + a--);
        // ExpA -> 19, a->19
        // +
        // ExpB -> 19, a -> 20
        // +
        // ExpC -> 20, a -> 19
        // ist system out : ExpA+ExpB+ExpC => 19+19+20 => 58
    }
}
