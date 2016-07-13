
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
    "skip_end",
    "skip_abstract",
    "skip_qr",
    "language",
    "skip_icon",
    "skip_image_name",
    "directory",
    "min_abstract_length",
    "skip_abstract_paren",
    "is_wikipedia",
    "source_skip",
    "is_fanon",
    "is_mediawiki",
    "src_info"
})
public class SrcOptions {

    @JsonProperty("skip_end")
    private String skipEnd;
    @JsonProperty("skip_abstract")
    private Integer skipAbstract;
    @JsonProperty("skip_qr")
    private String skipQr;
    @JsonProperty("language")
    private String language;
    @JsonProperty("skip_icon")
    private Integer skipIcon;
    @JsonProperty("skip_image_name")
    private Integer skipImageName;
    @JsonProperty("directory")
    private String directory;
    @JsonProperty("min_abstract_length")
    private String minAbstractLength;
    @JsonProperty("skip_abstract_paren")
    private Integer skipAbstractParen;
    @JsonProperty("is_wikipedia")
    private Integer isWikipedia;
    @JsonProperty("source_skip")
    private String sourceSkip;
    @JsonProperty("is_fanon")
    private Integer isFanon;
    @JsonProperty("is_mediawiki")
    private Integer isMediawiki;
    @JsonProperty("src_info")
    private String srcInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The skipEnd
     */
    @JsonProperty("skip_end")
    public String getSkipEnd() {
        return skipEnd;
    }

    /**
     * 
     * @param skipEnd
     *     The skip_end
     */
    @JsonProperty("skip_end")
    public void setSkipEnd(String skipEnd) {
        this.skipEnd = skipEnd;
    }

    /**
     * 
     * @return
     *     The skipAbstract
     */
    @JsonProperty("skip_abstract")
    public Integer getSkipAbstract() {
        return skipAbstract;
    }

    /**
     * 
     * @param skipAbstract
     *     The skip_abstract
     */
    @JsonProperty("skip_abstract")
    public void setSkipAbstract(Integer skipAbstract) {
        this.skipAbstract = skipAbstract;
    }

    /**
     * 
     * @return
     *     The skipQr
     */
    @JsonProperty("skip_qr")
    public String getSkipQr() {
        return skipQr;
    }

    /**
     * 
     * @param skipQr
     *     The skip_qr
     */
    @JsonProperty("skip_qr")
    public void setSkipQr(String skipQr) {
        this.skipQr = skipQr;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The skipIcon
     */
    @JsonProperty("skip_icon")
    public Integer getSkipIcon() {
        return skipIcon;
    }

    /**
     * 
     * @param skipIcon
     *     The skip_icon
     */
    @JsonProperty("skip_icon")
    public void setSkipIcon(Integer skipIcon) {
        this.skipIcon = skipIcon;
    }

    /**
     * 
     * @return
     *     The skipImageName
     */
    @JsonProperty("skip_image_name")
    public Integer getSkipImageName() {
        return skipImageName;
    }

    /**
     * 
     * @param skipImageName
     *     The skip_image_name
     */
    @JsonProperty("skip_image_name")
    public void setSkipImageName(Integer skipImageName) {
        this.skipImageName = skipImageName;
    }

    /**
     * 
     * @return
     *     The directory
     */
    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    /**
     * 
     * @param directory
     *     The directory
     */
    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * 
     * @return
     *     The minAbstractLength
     */
    @JsonProperty("min_abstract_length")
    public String getMinAbstractLength() {
        return minAbstractLength;
    }

    /**
     * 
     * @param minAbstractLength
     *     The min_abstract_length
     */
    @JsonProperty("min_abstract_length")
    public void setMinAbstractLength(String minAbstractLength) {
        this.minAbstractLength = minAbstractLength;
    }

    /**
     * 
     * @return
     *     The skipAbstractParen
     */
    @JsonProperty("skip_abstract_paren")
    public Integer getSkipAbstractParen() {
        return skipAbstractParen;
    }

    /**
     * 
     * @param skipAbstractParen
     *     The skip_abstract_paren
     */
    @JsonProperty("skip_abstract_paren")
    public void setSkipAbstractParen(Integer skipAbstractParen) {
        this.skipAbstractParen = skipAbstractParen;
    }

    /**
     * 
     * @return
     *     The isWikipedia
     */
    @JsonProperty("is_wikipedia")
    public Integer getIsWikipedia() {
        return isWikipedia;
    }

    /**
     * 
     * @param isWikipedia
     *     The is_wikipedia
     */
    @JsonProperty("is_wikipedia")
    public void setIsWikipedia(Integer isWikipedia) {
        this.isWikipedia = isWikipedia;
    }

    /**
     * 
     * @return
     *     The sourceSkip
     */
    @JsonProperty("source_skip")
    public String getSourceSkip() {
        return sourceSkip;
    }

    /**
     * 
     * @param sourceSkip
     *     The source_skip
     */
    @JsonProperty("source_skip")
    public void setSourceSkip(String sourceSkip) {
        this.sourceSkip = sourceSkip;
    }

    /**
     * 
     * @return
     *     The isFanon
     */
    @JsonProperty("is_fanon")
    public Integer getIsFanon() {
        return isFanon;
    }

    /**
     * 
     * @param isFanon
     *     The is_fanon
     */
    @JsonProperty("is_fanon")
    public void setIsFanon(Integer isFanon) {
        this.isFanon = isFanon;
    }

    /**
     * 
     * @return
     *     The isMediawiki
     */
    @JsonProperty("is_mediawiki")
    public Integer getIsMediawiki() {
        return isMediawiki;
    }

    /**
     * 
     * @param isMediawiki
     *     The is_mediawiki
     */
    @JsonProperty("is_mediawiki")
    public void setIsMediawiki(Integer isMediawiki) {
        this.isMediawiki = isMediawiki;
    }

    /**
     * 
     * @return
     *     The srcInfo
     */
    @JsonProperty("src_info")
    public String getSrcInfo() {
        return srcInfo;
    }

    /**
     * 
     * @param srcInfo
     *     The src_info
     */
    @JsonProperty("src_info")
    public void setSrcInfo(String srcInfo) {
        this.srcInfo = srcInfo;
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
