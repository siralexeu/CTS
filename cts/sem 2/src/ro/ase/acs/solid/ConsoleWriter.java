package ro.ase.acs.solid;

public class ConsoleWriter implements ValueWriter {

    @Override
    public void printResult(double result){
        System.out.println("Suma este: " + result);
    }
}
