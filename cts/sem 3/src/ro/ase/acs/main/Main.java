package ro.ase.acs.main;

import ro.ase.acs.ioccontainer.IocContainer;
import ro.ase.acs.servicelocater.ServiceLocator;
import ro.ase.acs.solid.classes.ConsolePrinter;
import ro.ase.acs.solid.classes.ConsoleReader;
import ro.ase.acs.solid.classes.SumCalculator;
import ro.ase.acs.solid.interfaces.Calculator;
import ro.ase.acs.solid.interfaces.ValuePrinter;
import ro.ase.acs.solid.interfaces.ValueReader;

public class Main {
    public static void main(String[] args) {
        // Version 1: Constructor injection
        Orchestrator orchestrator = new Orchestrator(new ConsoleReader(),
                new SumCalculator(), new ConsolePrinter());
        orchestrator.execute();

        // Version 2: using a Service Locator
        ServiceLocator serviceLocator = new ServiceLocator();
        serviceLocator.register("ValueReader", new ConsoleReader());
        serviceLocator.register("Calculator", new SumCalculator());
        serviceLocator.register("ValuePrinter", new ConsolePrinter()); //ValuePrinter.class.getName()
        orchestrator = new Orchestrator(serviceLocator);
        orchestrator.execute();

        // Version 3: using an IoC Container
        IocContainer iocContainer = new IocContainer();
        iocContainer.register(ValueReader.class, ConsoleReader.class);
        iocContainer.register(Calculator.class, SumCalculator.class);
        iocContainer.register(ValuePrinter.class, ConsolePrinter.class);
        orchestrator = new Orchestrator(iocContainer.resolve(ValueReader.class),
                iocContainer.resolve(Calculator.class),
                iocContainer.resolve(ValuePrinter.class));
        orchestrator.execute();
    }
}