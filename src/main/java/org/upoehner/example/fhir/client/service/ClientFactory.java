package org.upoehner.example.fhir.client.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.interceptor.BasicAuthInterceptor;

import java.util.Optional;

public class ClientFactory {
    private ClientFactory() {
    }

    public static IGenericClient createClient(String serverUrl, Optional<String> user, Optional<String> password) {
        final IGenericClient client = FhirContext.forR4().newRestfulGenericClient(serverUrl);

        if(user.isPresent() && password.isPresent()) {
            BasicAuthInterceptor basicAuth = new BasicAuthInterceptor(user.get(), password.get());
            client.registerInterceptor(basicAuth);
        }
        return client;
    }
}
