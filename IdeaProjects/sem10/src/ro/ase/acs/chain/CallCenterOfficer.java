package ro.ase.acs.chain;

public class CallCenterOfficer extends CallCenterHandler{
    public static final int OFFICER_TRESHOLD = 500;
    @Override
    public void requestRefund(double sum) {
        if(sum <= OFFICER_TRESHOLD){
            System.out.println("Refund was processed by the officer.");
        } else {
            if(nextHandler != null){
                nextHandler.requestRefund(sum);
            }
        }
    }
}
