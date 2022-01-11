package org.upoehner.example.fhir.client.adapter;


import org.upoehner.example.fhir.client.dto.ManagingOrganization;
import org.upoehner.example.fhir.client.dto.Name;
import org.upoehner.example.fhir.client.dto.Patient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.stream.Collectors;

@Path("/rest")
@Produces({MediaType.TEXT_PLAIN})
public class SimpleRestAdapter {

    @Inject
    PatientRestFhirClient simpleRestClient;

    @GET
    @Path("getSimple/{id}")
    public String useSimple(@PathParam("id") String id) {
        Patient patient = simpleRestClient.getPatientById(id);
        StringBuilder result = new StringBuilder();
        result.append("Found Patient: ");

        if (patient.getName() != null && !patient.getName().isEmpty()) {
            for (Name name : patient.getName()) {
                result.append(name.getGiven().stream().map(Object::toString).collect(Collectors.joining(", ")));
                result.append(" ");
                result.append(name.getFamily());
            }
        }

        ManagingOrganization managingOrganization = patient.getManagingOrganization();
        if(managingOrganization != null)
            result.append("\nManaging Organisation: " + managingOrganization.getReference());

        return result.toString();
    }

    @GET
    @Path("getJson/{id}")
    public String getJson(@PathParam("id") String id) {
        return simpleRestClient.getJson(id);
    }

}
