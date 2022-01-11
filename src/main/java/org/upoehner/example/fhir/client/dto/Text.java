
package org.upoehner.example.fhir.client.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "div"
})
@Generated("jsonschema2pojo")
public class Text {

    @JsonProperty("status")
    private String status;
    @JsonProperty("div")
    private String div;

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("div")
    public String getDiv() {
        return div;
    }

    @JsonProperty("div")
    public void setDiv(String div) {
        this.div = div;
    }

}
