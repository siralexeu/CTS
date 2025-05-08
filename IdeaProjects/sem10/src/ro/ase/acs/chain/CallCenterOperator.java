package ro.ase.acs.chain;

public class CallCenterOperator extends CallCenterHandler {
    public static final int OPERATOR_TRESHOLD = 100;
    @Override
    public void requestRefund(double sum) {
        if(sum <= OPERATOR_TRESHOLD){
            System.out.println("Refund was processed by the operator.");
        } else {
            if(nextHandler != null){
                nextHandler.requestRefund(sum);
            }
        }
    }
}
