
package com.mobile.jera.volleyex.pojo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "URL",
    "Height",
    "Width"
})
public class Icon {

    @JsonProperty("URL")
    private String uRL;
    @JsonProperty("Height")
    private String height;
    @JsonProperty("Width")
    private String width;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uRL
     */
    @JsonProperty("URL")
    public String getURL() {
        return uRL;
    }

    /**
     * 
     * @param uRL
     *     The URL
     */
    @JsonProperty("URL")
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("Height")
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The Height
     */
    @JsonProperty("Height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("Width")
    public String getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The Width
     */
    @JsonProperty("Width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
