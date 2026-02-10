package com.pduda.method;

import org.junit.Assert;
import org.junit.Test;

public class AuthenticationServiceTest {

    /**
     * Why: Verify that the administrator ID is always considered authenticated.
     */
    @Test
    public void administratorIsAlwaysAuthenticated() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;
        Assert.assertTrue(service.isAuthenticated(adminId));
    }

    /**
     * Why: Verify that a normal user ID is not authenticated by default.
     */
    @Test
    public void normalUserIsNotAuthenticatedInitially() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        Assert.assertFalse(service.isAuthenticated(normalUserId));
    }
}
