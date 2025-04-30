package ro.ase.acs.main;

import ro.ase.acs.builder.FoodItem;
import ro.ase.acs.builder.FoodItemBuilder;
import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.PrototypeCollection;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;

public class Main {
    public static void main(String[] args) {
        //prototype
//        BuildingBlock block1 = new WoodBlock();
//        block1.setX(10);
//        block1.setY(12);
//        block1.setZ(15);
//        block1.render();
//
//        BuildingBlock block2 = new StoneBlock();
//        block2.setX(20);
//        block2.setY(22);
//        block2.setZ(25);
//        block2.render();
//
//        try {
//            BuildingBlock block3 = (BuildingBlock) block2.clone();
//            block3.setX(300);
//            block3.render();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
        PrototypeCollection prototypeCollection = new PrototypeCollection();

        //builder
        BuildingBlock block4 = prototypeCollection.getBlock("wood");
        block4.render();

        BuildingBlock block5 = prototypeCollection.getBlock("stone");
        block5.render();

        FoodItem.Builder builder = new FoodItem.Builder();
        builder.addName("Cola").addPrice(7).addIsGlutenFree(true);
        FoodItem item1 = builder.build();
        System.out.println(item1);

        FoodItem item2 = builder.addName("Pizza").addPrice(35).addIsVegan(true).build();
        System.out.println(item2);

        FoodItemBuilder foodItemBuilder = new FoodItemBuilder();
        FoodItem item3 = foodItemBuilder.addName("Burger").addPrice(40).addDiscount(2).addProducer("ABC").build();
        System.out.println(item3);
    }
}
