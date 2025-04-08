package ro.ase.acs.solid;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader implements Closeable, ValueReader {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<Integer> readValues(){
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("valoare " + (i + 1) + ": ");
            values.add(scanner.nextInt());
        }
        return values;
    }

    @Override
    public void close() {
        scanner.close();
    }
}
