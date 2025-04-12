package Tasks.Collection_FrameWork;

public class ex_2_Generics {
    public static void main(String[] args) {
        GenericsClass<Integer> g = new GenericsClass(5);
        System.out.println(g.getdata());
        sum(5,6);
        sum("hello", "Test");

    }
    static <T> T sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
class GenericsClass<T>{
        private T data;

        public GenericsClass(T data){
            this.data = data;
        }
        public T getdata(){
            return this.data;
        }
}

