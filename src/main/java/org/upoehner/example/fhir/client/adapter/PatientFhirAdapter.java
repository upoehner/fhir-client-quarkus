package org.upoehner.example.fhir.client.adapter;

import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.Patient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/patient")
@Produces({MediaType.TEXT_PLAIN})
public class PatientFhirAdapter {

    @Inject
    IGenericClient fhirClient;

    @GET
    @Path("getById/{id}")
    public String getPatientById(@PathParam("id") String id) {

        Patient p = fhirClient.read().resource(Patient.class).withId(id).execute();
        return p.getName().get(0).getGivenAsSingleString();
    }
}
