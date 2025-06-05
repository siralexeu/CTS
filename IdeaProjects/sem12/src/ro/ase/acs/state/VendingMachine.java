package ro.ase.acs.state;

public class VendingMachine {
    private VendingMachineState state;
    private double balance = 0;

    public VendingMachine() {
        this.state = new InputMoneyState();
        state.displayMessage();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertMoney(double amount) {
        balance += amount;
        state = new InputMoneyState();
        state.displayMessage();
    }

    public void selectProduct(double price) {
        if(price <= balance){
            balance -= price;
            state = new PickUpProduct();
            state.displayMessage();
        }
        if(balance > 0){
            state = new ReturnChangeState();
            state.displayMessage();
        } else {
            state = new InputMoneyState();
            state.displayMessage();
        }
    }
}
