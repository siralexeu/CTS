package ro.ase.acs.main;

import ro.ase.acs.state.VendingMachine;
import ro.ase.acs.template.PartMover;
import ro.ase.acs.template.RoboticArm;
import ro.ase.acs.template.Worker;

public class Main {
    public static void main(String[] args) {
        //memento

        //state
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertMoney(20);
        vendingMachine.selectProduct(15);

        //template
        PartMover partMover = new RoboticArm();
        partMover.movePart();
        partMover = new Worker();
        partMover.movePart();
    }
}
