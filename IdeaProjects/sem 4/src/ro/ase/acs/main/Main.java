package ro.ase.acs.main;

import ro.ase.acs.simplefactory.RestApi;
import ro.ase.acs.simplefactory.RestApiFactory;
import ro.ase.acs.simplefactory.RestApiFactoryV2;
import ro.ase.acs.simplefactory.ServerType;
import ro.ase.acs.singleton.Logger;
import ro.ase.acs.singleton.LoggerV2;
import ro.ase.acs.singleton.LoggerV3;

public class Main {
    public static void main(String[] args) {
        //singleton
        Logger logger = Logger.getInstance();
        logger.log("Message from main");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Another message from main");

        System.out.println(logger == anotherLogger);

        LoggerV2 loggerV2 = LoggerV2.instance;
        loggerV2.log("Message from mainV2");
        LoggerV2.instance.log("Another message from mainV2");

        LoggerV3.INSTANCE.log("Message from mainV3");

        //simplefactory
        RestApiFactory factory = new RestApiFactory();
        RestApi api = factory.getRestApi("development");
        api.connect();

        RestApiFactoryV2 factoryV2 = new RestApiFactoryV2();
        RestApi apiV2 = factoryV2.getRestApi(ServerType.PROD);
        apiV2.connect();
    }
}
