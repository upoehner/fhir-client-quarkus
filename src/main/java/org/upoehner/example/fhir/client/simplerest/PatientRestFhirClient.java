package org.upoehner.example.fhir.client.simplerest;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.hl7.fhir.r4.model.Patient;

import javax.enterprise.inject.Default;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/Patient")
@RegisterRestClient
@RegisterClientHeaders(FhirHeaderConfiguration.class)
public interface PatientRestFhirClient {
    @GET
    @Path("{id}")
    Patient getPatientById(@PathParam("id") String id);

    @GET
    @Path("{id}")
    String getJson(@PathParam("id") String id);
}
