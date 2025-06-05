package ro.ase.acs.state;

public class PickUpProduct implements VendingMachineState{
    @Override
    public void displayMessage() {
        System.out.println("Pick up product");
    }
}
