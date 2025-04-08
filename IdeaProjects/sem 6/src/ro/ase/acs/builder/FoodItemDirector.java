package ro.ase.acs.builder;

import java.time.LocalDate;

public class FoodItemDirector {
    private FoodItemBuilder builder;

    public FoodItem create(String name, float price, LocalDate bestBefore){
        builder = new FoodItemBuilder();
        builder.addName(name).addPrice(price).addBestBefore(bestBefore);

        return builder.build();
    }
}
