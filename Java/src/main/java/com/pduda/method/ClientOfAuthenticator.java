package com.pduda.method;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientOfAuthenticator {

    private static final Logger LOGGER = Logger.getLogger(ClientOfAuthenticator.class.getName());
    private AuthenticationService authenticationService;

    public static void main(String[] args) {
        new ClientOfAuthenticator(new AuthenticationService()).run();
    }

    public ClientOfAuthenticator(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public void run() {
        boolean authenticated = authenticationService.isAuthenticated(33);
        LOGGER.log(Level.INFO, "33 is authenticated = {0}", authenticated);
    }
}
