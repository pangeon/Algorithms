package selection_sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  Test selection sort algorithm for table and lists
 *  ---------------------------------------------------
 *  smallest(ArrayList list) - find min element in list
 *  sort_list(ArrayList list) - sort all elements in list usage smallest function
 *  sort_tab(Integer[] tab) - sort all elements in table usage
 *  random_list(size, range) - create list in fill her random values
 *  */
class SelectionSort {
    private static Integer smallest(ArrayList<Integer> list) {
        Integer min = list.get(0);
        Integer index = 0;
        for(Integer i = 1; i < list.size(); i++) {
            if(list.get(i) < min) {
               min = list.get(i);
               index = i;
            }
        }
        return index;
    }
    static ArrayList<Integer> sort_list(ArrayList<Integer> list) {
        ArrayList<Integer> sorted_list = new ArrayList<>();
        int size = list.size();
        for(int i = 0; i < size; i++) {
            int min = smallest(list);
            sorted_list.add(list.remove(min));
        }
        System.out.println("sorted list: " + sorted_list);
        return sorted_list;
    }
    static Integer[] sort_tab(Integer[] tab) {
        int size = tab.length - 1;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i+1; j < size; j++)
                if (tab[j] < tab[min]) min = j;

            int temp = tab[min];
            tab[min] = tab[i];
            tab[i] = temp;
        }
        System.out.println("sorted table: " + Arrays.toString(tab));
        return tab;
    }
    static ArrayList<Integer> random_list(int size, int range) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i, (int) ((Math.random()*range)+ 1));
        }
        return list;
    }
}

