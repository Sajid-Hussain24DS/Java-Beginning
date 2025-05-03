package Multi_Threading;

public class GenerateSum extends Thread{
    @Override
    public void run(){
        int sum = 0;
        for (int i = 0; i<=50;i++) {
            sum += i;
        }
            System.out.println("Sum of 50 number is "+sum);


    }
}
