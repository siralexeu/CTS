package ro.ase.acs.main;

import ro.ase.acs.solid.ConsoleReader;
import ro.ase.acs.solid.ConsoleWriter;
import ro.ase.acs.solid.SumCalculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        List<Integer> values = reader.readValues();
        double result = calculator.computeResult(values);
        writer.printResult(result);
    }
}