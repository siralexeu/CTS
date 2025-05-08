package ro.ase.acs.adaptor;

public class BusTicketingSystem implements AbstractBusTicketingSystem {
    private static final int NUMBER_OF_SEATS = 50;
    private int numberOfOccupiedSeats = 0;

    @Override
    public void reserveSeat(){
        if(numberOfOccupiedSeats < NUMBER_OF_SEATS){
            numberOfOccupiedSeats++;
            System.out.println("Seat reserved! Number of occupied seats: " + numberOfOccupiedSeats);
        } else {
            System.out.println("The bus is full.");
        }
    }
}
