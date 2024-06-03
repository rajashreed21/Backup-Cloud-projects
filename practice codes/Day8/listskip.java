package lists;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listskip {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(23); // p
        l.add(24);
        l.add(25); // p
        l.add(26);
        l.add(27);
        l.add(28);

        l.stream().filter(e -> (e % 2 == 0)).forEach(System.out::println);
        List<Integer> newSet =  l.stream()
            //.filter(e -> (e % 2 == 0))
            .collect(Collectors.toList());
        
        //List --> Stream --> List
    }
}
    
        