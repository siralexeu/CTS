package ro.ase.acs.adaptor;

public class TicketingClassAdapter extends BusTicketingSystem implements AbstractTrainTicketingSystem {
    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        super.reserveSeat();
    }
}
