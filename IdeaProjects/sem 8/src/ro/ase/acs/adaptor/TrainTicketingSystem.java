package ro.ase.acs.adaptor;

public class TrainTicketingSystem implements AbstractTrainTicketingSystem {
    private final static int NUMBER_OF_WAGONS = 5;
    private final static int SEATS_PER_WAGON = 100;
    @Override
    public void buyTicket(int wagonNo, int seatNo){
        if(wagonNo >= 1 && wagonNo <= NUMBER_OF_WAGONS){
            if(seatNo >= 1 && seatNo <= SEATS_PER_WAGON){
                System.out.println("Ticket issued for wagon " + wagonNo + " and seat " + seatNo);
            }
        }
    }
}
