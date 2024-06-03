package lists;
import java.util.List;
import java.util.ArrayList;

public class rmelement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(45);
        list.add(56);
        list.add(16);
        list.add(6);
        list.add(37); 

        /*or we can use for loop instead of list.add//
        for(int i=1; i<11; i++)
        list.add(i);
        or we can use
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));*/


        System.out.println("Original list: " + list);

        removeEverySecondElement(list);

        System.out.println("Modified list: " + list);
    }
    public static void removeEverySecondElement(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            list.remove(i);
            
        }
    }
}
    

    