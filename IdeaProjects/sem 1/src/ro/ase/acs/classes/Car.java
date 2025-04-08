package ro.ase.acs.classes;

import ro.ase.acs.Taxable;

public final class Car extends Vehicle implements Taxable {
    private String producer;
    private int productionYear;
    private EngineType engineType;
    private static final int NB_OF_SEATS = 5;

    public Car(){
    }

    public Car(String producer, int productionYear,EngineType engineType) {
        super("white",5000);
        this.producer = producer;
        this.productionYear = productionYear;
        this.engineType = engineType;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public float computeFinalPrice() {
        if(engineType == EngineType.ELECTRIC){
            return getPrice() - 10_000;
        } else if(engineType == EngineType.HYBRID){
            return getPrice() - 5000;
        }
        return getPrice();
    }

    @Override
    public float computeTax() {
        return getPrice() * 0.05f;
    }
}
