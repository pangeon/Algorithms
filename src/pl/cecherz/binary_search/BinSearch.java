package pl.cecherz.binary_search;


/**
 *  Test binary search algorithm
 *  ----------------------------
 *  find(list, item) - body method contain algorithm code
 *  iterate(tab) - show all values in table and loop calls
 *  index(tab, item) - print index of declare number to find
 *  fill(size) - fill declare table range values n - 0, limit - parameter
 *  */
class BinSearch {
    private static int find(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        int i = 1;

        while(low <= high) {
           int mid = (low + high) / 2;
           int guess = list[mid];
           if (guess == item) {
               System.out.println("\nnumber of iterations: " + i);
               return mid;
           }
           if (guess > item) {
               high = mid - 1;
               i++;
           } else {
               low = mid + 1;
               i++;
           }
        }
        return 0;
    }
    static void iterate(int[] tab) {
        System.out.println("values from array:");
        for(int i = 0; i < tab.length; i++) {
            System.out.print("[" + i + "]" + tab[i] + " ");
        }
    }
    static void index(int[] tab, int item) {
        System.out.println("\nindex of the searched number: " + find(tab, item));
    }
    static int[] fill(int size) {
        int[] tab = new int[size];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }
        return tab;
    }
}
