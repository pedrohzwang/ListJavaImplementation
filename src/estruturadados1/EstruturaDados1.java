package estruturadados1;

import java.util.Arrays;
import structures.ListaComArray;

public class EstruturaDados1 {

    public static void main(String[] args) {
        ListaComArray array = new ListaComArray();
        
        array.add(10);
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(9);
        array.add(13);
        System.out.println(array.size());
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("\n----------");
        array.add(2, 8);
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("\n----------");
        array.remove(2);
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println(array.size());
        System.out.println(array.get(2));
    }
}
