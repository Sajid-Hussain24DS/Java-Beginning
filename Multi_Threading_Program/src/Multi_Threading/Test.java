package Multi_Threading;

public class Test {
    public static void main(String[] args) {


        TestThreading testThreading = new TestThreading();
        Thread thread1 = new Thread(testThreading);
        thread1.start();
        System.out.println("Thread t1: "+thread1.getName());

        GenerateSum generateSum = new GenerateSum();
        Thread thread2 = new Thread(generateSum);
        thread2.start();
        System.out.println("Thread T2: "+thread2.getName());

        SumOfArray sumOfArray = new SumOfArray();
        Thread thread3 = new Thread(sumOfArray);
        thread3.start();
        System.out.println("Thread T3: "+thread3.getName());

        RemoveDuplicateArray remove = new RemoveDuplicateArray();
        Thread thread4 = new Thread(remove);
        thread4.start();
        System.out.println("Thread T4: "+thread4.getName());

        SortArray sortArray = new SortArray();
        Thread thread5 = new Thread(sortArray);
        thread5.start();
        System.out.println("Thread T5 : "+thread5.getName());


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=10;i++) {
                    System.out.println("2*" + i + "=" + (2*i));
                }

                }

            };
        Thread thread6 = new Thread(runnable);
        thread6.start();

        Thread thread7 = new Thread() {
            @Override
            public void run() {
                for (int i=1; i<=10;i++) {
                    System.out.println("3*" + i + "=" + (3 * i));
            }

        }

        };
        thread7.start();

    }}

