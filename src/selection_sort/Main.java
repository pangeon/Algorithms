package selection_sort;

import java.util.ArrayList;
import static selection_sort.SelectionSort.*;

public class Main {
    public static void main(String[] args) {
        Integer[] tab_5 = {5, 3, 1, 7, 9};

        ArrayList<Integer> list_8 = new ArrayList<>();

        list_8.add(0, 5);
        list_8.add(1, 3);
        list_8.add(2, 1);
        list_8.add(3, 7);
        list_8.add(4, 9);
        list_8.add(5, 2);
        list_8.add(6, 0);
        list_8.add(7, 4);

        sort_list(list_8);
        sort_list(random_list(10,100));
        sort_tab(tab_5);

    }
}
