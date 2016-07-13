
package com.mobile.jera.volleyex.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "DefinitionSource",
    "Heading",
    "ImageWidth",
    "RelatedTopics",
    "Entity",
    "meta",
    "Type",
    "Redirect",
    "DefinitionURL",
    "AbstractURL",
    "Definition",
    "AbstractSource",
    "Infobox",
    "Image",
    "ImageIsLogo",
    "Abstract",
    "AbstractText",
    "AnswerType",
    "ImageHeight",
    "Answer",
    "Results"
})
public class Pojo {

    @JsonProperty("DefinitionSource")
    private String definitionSource;
    @JsonProperty("Heading")
    private String heading;
    @JsonProperty("ImageWidth")
    private Integer imageWidth;
    @JsonProperty("RelatedTopics")
    private List<RelatedTopic> relatedTopics = new ArrayList<RelatedTopic>();
    @JsonProperty("Entity")
    private String entity;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Redirect")
    private String redirect;
    @JsonProperty("DefinitionURL")
    private String definitionURL;
    @JsonProperty("AbstractURL")
    private String abstractURL;
    @JsonProperty("Definition")
    private String definition;
    @JsonProperty("AbstractSource")
    private String abstractSource;
    @JsonProperty("Infobox")
    private String infobox;
    @JsonProperty("Image")
    private String image;
    @JsonProperty("ImageIsLogo")
    private Integer imageIsLogo;
    @JsonProperty("Abstract")
    private String _abstract;
    @JsonProperty("AbstractText")
    private String abstractText;
    @JsonProperty("AnswerType")
    private String answerType;
    @JsonProperty("ImageHeight")
    private Integer imageHeight;
    @JsonProperty("Answer")
    private String answer;
    @JsonProperty("Results")
    private List<Object> results = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The definitionSource
     */
    @JsonProperty("DefinitionSource")
    public String getDefinitionSource() {
        return definitionSource;
    }

    /**
     * 
     * @param definitionSource
     *     The DefinitionSource
     */
    @JsonProperty("DefinitionSource")
    public void setDefinitionSource(String definitionSource) {
        this.definitionSource = definitionSource;
    }

    /**
     * 
     * @return
     *     The heading
     */
    @JsonProperty("Heading")
    public String getHeading() {
        return heading;
    }

    /**
     * 
     * @param heading
     *     The Heading
     */
    @JsonProperty("Heading")
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * 
     * @return
     *     The imageWidth
     */
    @JsonProperty("ImageWidth")
    public Integer getImageWidth() {
        return imageWidth;
    }

    /**
     * 
     * @param imageWidth
     *     The ImageWidth
     */
    @JsonProperty("ImageWidth")
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * 
     * @return
     *     The relatedTopics
     */
    @JsonProperty("RelatedTopics")
    public List<RelatedTopic> getRelatedTopics() {
        return relatedTopics;
    }

    /**
     * 
     * @param relatedTopics
     *     The RelatedTopics
     */
    @JsonProperty("RelatedTopics")
    public void setRelatedTopics(List<RelatedTopic> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    /**
     * 
     * @return
     *     The entity
     */
    @JsonProperty("Entity")
    public String getEntity() {
        return entity;
    }

    /**
     * 
     * @param entity
     *     The Entity
     */
    @JsonProperty("Entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
     * 
     * @return
     *     The meta
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The redirect
     */
    @JsonProperty("Redirect")
    public String getRedirect() {
        return redirect;
    }

    /**
     * 
     * @param redirect
     *     The Redirect
     */
    @JsonProperty("Redirect")
    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    /**
     * 
     * @return
     *     The definitionURL
     */
    @JsonProperty("DefinitionURL")
    public String getDefinitionURL() {
        return definitionURL;
    }

    /**
     * 
     * @param definitionURL
     *     The DefinitionURL
     */
    @JsonProperty("DefinitionURL")
    public void setDefinitionURL(String definitionURL) {
        this.definitionURL = definitionURL;
    }

    /**
     * 
     * @return
     *     The abstractURL
     */
    @JsonProperty("AbstractURL")
    public String getAbstractURL() {
        return abstractURL;
    }

    /**
     * 
     * @param abstractURL
     *     The AbstractURL
     */
    @JsonProperty("AbstractURL")
    public void setAbstractURL(String abstractURL) {
        this.abstractURL = abstractURL;
    }

    /**
     * 
     * @return
     *     The definition
     */
    @JsonProperty("Definition")
    public String getDefinition() {
        return definition;
    }

    /**
     * 
     * @param definition
     *     The Definition
     */
    @JsonProperty("Definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * 
     * @return
     *     The abstractSource
     */
    @JsonProperty("AbstractSource")
    public String getAbstractSource() {
        return abstractSource;
    }

    /**
     * 
     * @param abstractSource
     *     The AbstractSource
     */
    @JsonProperty("AbstractSource")
    public void setAbstractSource(String abstractSource) {
        this.abstractSource = abstractSource;
    }

    /**
     * 
     * @return
     *     The infobox
     */
    @JsonProperty("Infobox")
    public String getInfobox() {
        return infobox;
    }

    /**
     * 
     * @param infobox
     *     The Infobox
     */
    @JsonProperty("Infobox")
    public void setInfobox(String infobox) {
        this.infobox = infobox;
    }

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("Image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The Image
     */
    @JsonProperty("Image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The imageIsLogo
     */
    @JsonProperty("ImageIsLogo")
    public Integer getImageIsLogo() {
        return imageIsLogo;
    }

    /**
     * 
     * @param imageIsLogo
     *     The ImageIsLogo
     */
    @JsonProperty("ImageIsLogo")
    public void setImageIsLogo(Integer imageIsLogo) {
        this.imageIsLogo = imageIsLogo;
    }

    /**
     * 
     * @return
     *     The _abstract
     */
    @JsonProperty("Abstract")
    public String getAbstract() {
        return _abstract;
    }

    /**
     * 
     * @param _abstract
     *     The Abstract
     */
    @JsonProperty("Abstract")
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     * 
     * @return
     *     The abstractText
     */
    @JsonProperty("AbstractText")
    public String getAbstractText() {
        return abstractText;
    }

    /**
     * 
     * @param abstractText
     *     The AbstractText
     */
    @JsonProperty("AbstractText")
    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    /**
     * 
     * @return
     *     The answerType
     */
    @JsonProperty("AnswerType")
    public String getAnswerType() {
        return answerType;
    }

    /**
     * 
     * @param answerType
     *     The AnswerType
     */
    @JsonProperty("AnswerType")
    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    /**
     * 
     * @return
     *     The imageHeight
     */
    @JsonProperty("ImageHeight")
    public Integer getImageHeight() {
        return imageHeight;
    }

    /**
     * 
     * @param imageHeight
     *     The ImageHeight
     */
    @JsonProperty("ImageHeight")
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * 
     * @return
     *     The answer
     */
    @JsonProperty("Answer")
    public String getAnswer() {
        return answer;
    }

    /**
     * 
     * @param answer
     *     The Answer
     */
    @JsonProperty("Answer")
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * 
     * @return
     *     The results
     */
    @JsonProperty("Results")
    public List<Object> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The Results
     */
    @JsonProperty("Results")
    public void setResults(List<Object> results) {
        this.results = results;
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
