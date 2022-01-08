package org.upoehner.example.fhir.client.simplerest;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.enterprise.context.ApplicationScoped;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public class SimpleRestClientConfiguration {

    @ConfigProperty(name = "fhir.server")
    String serverUrl;

    @ConfigProperty(name = "adapter.fhir.timeout")
    Long timeout;

    @ApplicationScoped
    public PatientRestFhirClient createClient() throws URISyntaxException {
        return RestClientBuilder.newBuilder()
                    .connectTimeout(timeout, TimeUnit.MILLISECONDS)
                    .readTimeout(timeout, TimeUnit.MILLISECONDS)
                    .baseUri(new URI(serverUrl)).build(PatientRestFhirClient.class);
    }

}
