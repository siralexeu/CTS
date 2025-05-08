package ro.ase.acs.proxy;

public class AuthenticationProxy implements AbstractAuthenticationService{
    private final AbstractAuthenticationService authenticationService;
    private int noOfFailedAttempts = 0;

    public AuthenticationProxy(AbstractAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public boolean login(String username, String password) {
        if(noOfFailedAttempts > 4) {
            return false;
        }

        boolean isAuthenticationSuccesfull = authenticationService.login(username,password);
        if(!isAuthenticationSuccesfull){
            noOfFailedAttempts++;
            return false;
        }
        else{
            noOfFailedAttempts = 0;
            return true;
        }
    }
}

