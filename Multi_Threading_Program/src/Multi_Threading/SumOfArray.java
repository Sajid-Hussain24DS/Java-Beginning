package Multi_Threading;

public class SumOfArray extends Thread{
    @Override
    public void run(){
        int[] array = {2, 4, 3, 6, 7, 18, 90, 45, 50};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The Sum Of Array is: " + sum);
        }
    }


