package recursion;

public class Main {
    public static void main(String[] args) {

        Factorial.printResult(10);
        Factorial.printResult(20);
        Factorial.printResult(30);
        Factorial.printResult(40);
        Factorial.printResult(50);
        Factorial.printResult(60);
        Factorial.printResult(70);
        Factorial.printResult(80);
        System.out.println("--------");
        FactorialTail.printResult(10);
        FactorialTail.printResult(20);
        FactorialTail.printResult(30);
        FactorialTail.printResult(40);
        FactorialTail.printResult(50);
        FactorialTail.printResult(60);
        FactorialTail.printResult(70);
        FactorialTail.printResult(80);
        FactorialTail.printResult(90);
        System.out.println("--------");
        MathArray.printValue(new int[] {1, 2, 3});
        MathArray.showMinValue(new int[] {1, 2, 3, -1, -2, 33});
    }
}
