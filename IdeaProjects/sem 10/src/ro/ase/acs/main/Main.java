package ro.ase.acs.main;

import ro.ase.acs.chain.CallCenterHandler;
import ro.ase.acs.chain.CallCenterManager;
import ro.ase.acs.chain.CallCenterOfficer;
import ro.ase.acs.chain.CallCenterOperator;
import ro.ase.acs.command.*;
import ro.ase.acs.observer.YoutubeChannel;
import ro.ase.acs.observer.YoutubeSubscriber;
import ro.ase.acs.strategy.Calculator;
import ro.ase.acs.strategy.Product;
import ro.ase.acs.strategy.Sum;

public class Main {
    public static void main(String[] args) {
        //chain
        CallCenterHandler operator = new CallCenterOperator();
        CallCenterHandler officer = new CallCenterOfficer();
        CallCenterHandler manager = new CallCenterManager();

        operator.setNextHandler(officer);
        officer.setNextHandler(manager);

        operator.requestRefund(50);
        operator.requestRefund(150);
        operator.requestRefund(600);

        //command
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        FoodOrder order1 = new PizzaOrder(chef);
        FoodOrder order2 = new PizzaOrder(chef);
        FoodOrder order3 = new BurgerOrder(chef);

        waiter.addOrder(order1);
        waiter.addOrder(order2);
        waiter.addOrder(order3);

        waiter.sendOrders();

        //strategy
        Calculator calculator = new Calculator();
        calculator.setOperation(new Sum());
        double result = calculator.compute(1, 2, 3, 4);
        System.out.println("Sum: " + result);

        calculator.setOperation(new Product());
        result=calculator.compute(1,2,3,4);
        System.out.println("Product: " + result);

        calculator.setOperation(numbers ->numbers.stream().mapToInt(n -> n).average().getAsDouble());
        result = calculator.compute(1,2,3,4);
        System.out.println("Average: " + result);

        //observer
        YoutubeChannel youtubeChannel = new YoutubeChannel("My Channel");

        YoutubeSubscriber subscriber1 = new YoutubeSubscriber();
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber();
        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber2);

        youtubeChannel.uploadVideo("My first video");

        youtubeChannel.unsubscribe(subscriber1);

        youtubeChannel.uploadVideo("My second video");

    }
}
