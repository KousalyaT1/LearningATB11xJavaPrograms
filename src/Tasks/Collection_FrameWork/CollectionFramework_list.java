package Tasks.Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework_list {
    public static void main(String[] args) {
        List list = List.of("hello", 3.45, 5, "QA1");
        System.out.println(list);

        List nl= new ArrayList();
        nl.add("mango");
        nl.add("Orange");
        nl.add(null);
        nl.add(45.633);
        System.out.println(nl);

        ArrayList al = new ArrayList();
        System.out.println(al.isEmpty());
    }
}
