package ro.ase.acs.main;

import ro.ase.acs.adaptor.*;
import ro.ase.acs.facade.CarFacade;
import ro.ase.acs.proxy.AbstractAuthenticationService;
import ro.ase.acs.proxy.AuthenticationProxy;
import ro.ase.acs.proxy.AuthenticationService;

public class Main {
    public static void main(String[] args) {
        //adaptor
        AbstractTrainTicketingSystem ticketingSystem = new TrainTicketingSystem();
        ticketingSystem.buyTicket(2,34);

        ticketingSystem = new TicketingObjectAdapter(new BusTicketingSystem());
        ticketingSystem.buyTicket(5,55);

        ticketingSystem = new TicketingClassAdapter();
        ticketingSystem.buyTicket(1,10);

        //facade
        CarFacade car = new CarFacade();
        car.start();
        car.emergencyBrake();

        //proxy
        AbstractAuthenticationService authenticationService = new AuthenticationService();
        boolean result = authenticationService.login("admin", "admin");
        System.out.println("\n"+result);

        authenticationService = new AuthenticationProxy(new AuthenticationService());
        for(int i=0;i<5;i++){
            authenticationService.login("1","1");

        }
        result = authenticationService.login("admin", "admin");
        System.out.println(result);

    }
}
