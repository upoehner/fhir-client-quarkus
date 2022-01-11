
package org.upoehner.example.fhir.client.dto;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "id",
    "meta",
    "text",
    "identifier",
    "active",
    "name",
    "telecom",
    "gender",
    "birthDate",
    "address",
    "managingOrganization"
})
@Generated("jsonschema2pojo")
public class Patient {

    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("id")
    private String id;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("text")
    private Text text;
    @JsonProperty("identifier")
    private List<Identifier> identifier = null;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("name")
    private List<Name> name = null;
    @JsonProperty("telecom")
    private List<Telecom> telecom = null;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("address")
    private List<Address> address = null;
    @JsonProperty("managingOrganization")
    private ManagingOrganization managingOrganization;

    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Text text) {
        this.text = text;
    }

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("name")
    public List<Name> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(List<Name> name) {
        this.name = name;
    }

    @JsonProperty("telecom")
    public List<Telecom> getTelecom() {
        return telecom;
    }

    @JsonProperty("telecom")
    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @JsonProperty("managingOrganization")
    public ManagingOrganization getManagingOrganization() {
        return managingOrganization;
    }

    @JsonProperty("managingOrganization")
    public void setManagingOrganization(ManagingOrganization managingOrganization) {
        this.managingOrganization = managingOrganization;
    }

}
