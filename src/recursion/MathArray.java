package recursion;

class MathArray {
    private static int arraySum(int[] tab, int n) {
        return n <= 0 ? 0 : arraySum(tab, n - 1) + tab[n - 1];
    }
    private static int minArray(int[] tab, int n) {
        switch (n) {
            case 1:
                return tab[0];
            default:
                return tab[n] < minArray(tab, n - 1) ? tab[n] : minArray(tab, n - 1);
        }
    }
    static void printValue(int[] tab) {
        System.out.println(arraySum(tab, tab.length));
    }
    static void showMinValue(int[] tab) {
        System.out.println(minArray(tab, tab.length - 1));
    }
}
