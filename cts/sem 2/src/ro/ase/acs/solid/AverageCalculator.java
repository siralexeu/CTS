package ro.ase.acs.solid;

import java.util.List;

public class AverageCalculator implements Calculator {
    @Override
    public double computeResult(List<Integer> values) {
        return values.stream().mapToInt(x -> x).average().getAsDouble();
    }
}
