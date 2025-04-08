package ro.ase.acs.simplefactory;

public class RestApiFactory {
    public static final String DEVELOPMENT = "development";
    public static final String PRODUCTION = "production";

    public RestApi getRestApi(String serverType) {
        if (serverType == DEVELOPMENT){
            return new RestApiDevelopment();
        }
        else if (serverType == PRODUCTION){
            return new RestApiProduction();
        }
        else {
            return null;
        }
    }
}
