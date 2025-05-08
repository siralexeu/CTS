package ro.ase.acs.chain;

public class CallCenterManager extends CallCenterHandler{
    @Override
    public void requestRefund(double sum) {
        System.out.println("Refund was processed by the manager.");
    }
}
