package ro.ase.acs.solid;

import java.util.List;

public class SumCalculator implements Calculator {

    @Override
    public double computeResult(List<Integer> values) {
        long sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += values.get(i);
        }
        return sum;
    }
}
