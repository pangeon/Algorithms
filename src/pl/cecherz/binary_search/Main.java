package pl.cecherz.binary_search;

import static pl.cecherz.binary_search.BinSearch.*;

public class Main {

    public static void main(String[] args) {
        int[] tab_5 = {1, 3, 5, 7, 9};
        int[] tab_15 = {1, 3, 5, 7, 9, 12, 13, 18, 19, 67, 88, 91, 97, 100, 101};
        int[] tab_20 = {1, 3, 5, 7, 9, 12, 13, 18, 19, 67, 88, 91, 97, 100, 101, 155, 188, 192, 202, 201};
        int[] tab_101= fill(100);
        int[] tab_201= fill(200);

        iterate(tab_5);
        index(tab_5, 9);
        iterate(tab_15);
        index(tab_15, 9);
        iterate(tab_20);
        index(tab_20, 100);
        iterate(tab_101);
        index(tab_101, 2);
        iterate(tab_201);
        index(tab_201, 2);
    }
}
