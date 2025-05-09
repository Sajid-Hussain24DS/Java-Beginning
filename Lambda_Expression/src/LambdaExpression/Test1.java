package LambdaExpression;

public class Test1 {
    public static void main(String[] args) {
        Test test = () -> {
            System.out.println("Lmbada Expression");
        };
        test.show();

        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        //  Thread thread = new Thread(r1);
        //   thread.start();

        AddFunctionalInterface add = (int a, int b) -> {
            System.out.println("Sum Of Number is :" + (a + b));
        };
        add.Add(5, 7);

        ReturnFunctionalInterface result = (int a , int b)->{
            int c = a+b;
            return c;
        };

        int sum = result.Add(10,22);
        System.out.println("Sum Of Return Interface: "+sum);


        // an other way of this one is
        ReturnFunctionalInterface result1 = (int a , int b)-> a+b;
        int sum1 = result1.Add(12,13);
        System.out.println("Sum is :"+sum1);

        ReturnTablePrinter tp = n -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        };
        tp.printTable(5);


        ArrayPrinter ap = arr -> {
            for (int num : arr)
                System.out.print(num + " ");
            System.out.println();
        };
        ap.printArray(new int[]{1, 2, 3, 4});


        Multiplier m = (a, b) ->
                System.out.println("Product: " + (a * b));
        m.multiply(4, 5);

        NumberChecker checker = n -> System.out.println(n % 2 == 0 ? "Even" : "Odd");
        checker.check(11);

    } }
