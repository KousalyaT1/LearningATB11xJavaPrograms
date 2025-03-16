package Tasks;

public class Task06_TriangleClassifier_14thMarch {
    public static void main(String[] args){
        int l1 = 45, l2 = 56, l3 = 45;
        if(l1 == l2 && l2 == l3 && l3 == l1 )
            System.out.println("Triangle is equilateral");
        else if (l1 == l2 || l2 == l3 || l3 == l1)
            System.out.println("Triangle is isosceles");
        else
            System.out.println("Triangle is scalene");
    }
}
