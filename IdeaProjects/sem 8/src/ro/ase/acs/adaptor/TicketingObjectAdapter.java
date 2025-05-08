package ro.ase.acs.adaptor;

public class TicketingObjectAdapter implements AbstractTrainTicketingSystem{
    private final AbstractBusTicketingSystem busTicketingSystem;

    public TicketingObjectAdapter(AbstractBusTicketingSystem busTicketingSystem) {
        this.busTicketingSystem = busTicketingSystem;
    }

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        if(busTicketingSystem != null){
            busTicketingSystem.reserveSeat();
        }
    }
}
