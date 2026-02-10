package com.pduda.method;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class ClientOfAuthenticatorTest {

    /**
     * Why: Test main method to ensure full coverage and verify basic execution
     * flow.
     */
    @Test
    public void testMain() {
        ClientOfAuthenticator.main(new String[] {});
    }

    /**
     * Why: Test run method with mocked service to verify interaction and logging.
     */
    @Test
    public void testRun() {
        AuthenticationService service = mock(AuthenticationService.class);
        ClientOfAuthenticator client = new ClientOfAuthenticator(service);
        client.run();
        verify(service).isAuthenticated(33);
    }
}
