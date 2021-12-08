package org.upoehner.example.fhir.client.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.interceptor.BasicAuthInterceptor;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

public class FhirClientConfiguration {
    @ConfigProperty(name = "fhir.server")
    String serverUrl;

    @ConfigProperty(name = "fhir.user")
    Optional<String> user;

    @ConfigProperty(name = "fhir.password")
    Optional<String> password;

    @ApplicationScoped
    public IGenericClient createClient() {
        final IGenericClient client = FhirContext.forR4().newRestfulGenericClient(serverUrl);

        if(user.isPresent() && password.isPresent()) {
            BasicAuthInterceptor basicAuth = new BasicAuthInterceptor(user.get(), password.get());
            client.registerInterceptor(basicAuth);
        }
        return client;
    }
}
