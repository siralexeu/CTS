package ro.ase.acs.state;

import java.sql.SQLOutput;

public class ReturnChangeState implements VendingMachineState{

    @Override
    public void displayMessage() {
        System.out.println("Pick up the change");
    }
}
