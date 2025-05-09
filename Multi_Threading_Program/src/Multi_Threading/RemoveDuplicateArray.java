package Multi_Threading;

import java.util.ArrayList;

public class RemoveDuplicateArray extends Thread {
    @Override
    public void run() {
        int[] arr = {1, 5, 9, 3, 5, 2, 1};
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!integers.contains(arr[i])) {
            integers.add(arr[i]);
        }
    }
        System.out.println("Unique Element Of Array is: "+integers);
}

}
