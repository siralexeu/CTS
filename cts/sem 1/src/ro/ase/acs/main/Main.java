package ro.ase.acs.main;

import ro.ase.acs.classes.Car;
import ro.ase.acs.classes.EngineType;
import ro.ase.acs.classes.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car("Dacia", 2024, EngineType.HYBRID);
        v.setPrice(25_000);
        System.out.println(v.computeFinalPrice());
    }
}