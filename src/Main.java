import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(1, 1);
        hash.put(2,2);
        int i = 1;
        while( i != hash.size())
        {
            System.out.println(hash.get(i++));
        }

        List<Integer> list = new ArrayList<>();

        System.out.println(list.get(1));
    }
}