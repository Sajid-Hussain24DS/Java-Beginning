package ComparatorInterface;

import java.util.Comparator;

public class LaptopPriceSorter implements Comparator<Laptop> {
    @Override
    public int  compare(Laptop l1, Laptop l2){
        return Double.compare(l1.getPrice(),l2.getPrice());
    }

}
