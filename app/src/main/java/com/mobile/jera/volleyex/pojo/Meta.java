
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
    "maintainer",
    "perl_module",
    "status",
    "production_state",
    "dev_date",
    "js_callback_name",
    "signal_from",
    "live_date",
    "src_id",
    "src_options",
    "repo",
    "developer",
    "tab",
    "producer",
    "unsafe",
    "id",
    "dev_milestone",
    "topic",
    "name",
    "attribution",
    "created_date",
    "example_query",
    "description",
    "is_stackexchange",
    "designer",
    "src_domain",
    "src_name",
    "blockgroup",
    "src_url"
})
public class Meta {

    @JsonProperty("maintainer")
    private Maintainer maintainer;
    @JsonProperty("perl_module")
    private String perlModule;
    @JsonProperty("status")
    private String status;
    @JsonProperty("production_state")
    private String productionState;
    @JsonProperty("dev_date")
    private Object devDate;
    @JsonProperty("js_callback_name")
    private String jsCallbackName;
    @JsonProperty("signal_from")
    private String signalFrom;
    @JsonProperty("live_date")
    private Object liveDate;
    @JsonProperty("src_id")
    private Integer srcId;
    @JsonProperty("src_options")
    private SrcOptions srcOptions;
    @JsonProperty("repo")
    private String repo;
    @JsonProperty("developer")
    private List<Developer> developer = new ArrayList<Developer>();
    @JsonProperty("tab")
    private String tab;
    @JsonProperty("producer")
    private Object producer;
    @JsonProperty("unsafe")
    private Integer unsafe;
    @JsonProperty("id")
    private String id;
    @JsonProperty("dev_milestone")
    private String devMilestone;
    @JsonProperty("topic")
    private List<String> topic = new ArrayList<String>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("attribution")
    private Object attribution;
    @JsonProperty("created_date")
    private Object createdDate;
    @JsonProperty("example_query")
    private String exampleQuery;
    @JsonProperty("description")
    private String description;
    @JsonProperty("is_stackexchange")
    private Object isStackexchange;
    @JsonProperty("designer")
    private Object designer;
    @JsonProperty("src_domain")
    private String srcDomain;
    @JsonProperty("src_name")
    private String srcName;
    @JsonProperty("blockgroup")
    private Object blockgroup;
    @JsonProperty("src_url")
    private Object srcUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The maintainer
     */
    @JsonProperty("maintainer")
    public Maintainer getMaintainer() {
        return maintainer;
    }

    /**
     * 
     * @param maintainer
     *     The maintainer
     */
    @JsonProperty("maintainer")
    public void setMaintainer(Maintainer maintainer) {
        this.maintainer = maintainer;
    }

    /**
     * 
     * @return
     *     The perlModule
     */
    @JsonProperty("perl_module")
    public String getPerlModule() {
        return perlModule;
    }

    /**
     * 
     * @param perlModule
     *     The perl_module
     */
    @JsonProperty("perl_module")
    public void setPerlModule(String perlModule) {
        this.perlModule = perlModule;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The productionState
     */
    @JsonProperty("production_state")
    public String getProductionState() {
        return productionState;
    }

    /**
     * 
     * @param productionState
     *     The production_state
     */
    @JsonProperty("production_state")
    public void setProductionState(String productionState) {
        this.productionState = productionState;
    }

    /**
     * 
     * @return
     *     The devDate
     */
    @JsonProperty("dev_date")
    public Object getDevDate() {
        return devDate;
    }

    /**
     * 
     * @param devDate
     *     The dev_date
     */
    @JsonProperty("dev_date")
    public void setDevDate(Object devDate) {
        this.devDate = devDate;
    }

    /**
     * 
     * @return
     *     The jsCallbackName
     */
    @JsonProperty("js_callback_name")
    public String getJsCallbackName() {
        return jsCallbackName;
    }

    /**
     * 
     * @param jsCallbackName
     *     The js_callback_name
     */
    @JsonProperty("js_callback_name")
    public void setJsCallbackName(String jsCallbackName) {
        this.jsCallbackName = jsCallbackName;
    }

    /**
     * 
     * @return
     *     The signalFrom
     */
    @JsonProperty("signal_from")
    public String getSignalFrom() {
        return signalFrom;
    }

    /**
     * 
     * @param signalFrom
     *     The signal_from
     */
    @JsonProperty("signal_from")
    public void setSignalFrom(String signalFrom) {
        this.signalFrom = signalFrom;
    }

    /**
     * 
     * @return
     *     The liveDate
     */
    @JsonProperty("live_date")
    public Object getLiveDate() {
        return liveDate;
    }

    /**
     * 
     * @param liveDate
     *     The live_date
     */
    @JsonProperty("live_date")
    public void setLiveDate(Object liveDate) {
        this.liveDate = liveDate;
    }

    /**
     * 
     * @return
     *     The srcId
     */
    @JsonProperty("src_id")
    public Integer getSrcId() {
        return srcId;
    }

    /**
     * 
     * @param srcId
     *     The src_id
     */
    @JsonProperty("src_id")
    public void setSrcId(Integer srcId) {
        this.srcId = srcId;
    }

    /**
     * 
     * @return
     *     The srcOptions
     */
    @JsonProperty("src_options")
    public SrcOptions getSrcOptions() {
        return srcOptions;
    }

    /**
     * 
     * @param srcOptions
     *     The src_options
     */
    @JsonProperty("src_options")
    public void setSrcOptions(SrcOptions srcOptions) {
        this.srcOptions = srcOptions;
    }

    /**
     * 
     * @return
     *     The repo
     */
    @JsonProperty("repo")
    public String getRepo() {
        return repo;
    }

    /**
     * 
     * @param repo
     *     The repo
     */
    @JsonProperty("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     * 
     * @return
     *     The developer
     */
    @JsonProperty("developer")
    public List<Developer> getDeveloper() {
        return developer;
    }

    /**
     * 
     * @param developer
     *     The developer
     */
    @JsonProperty("developer")
    public void setDeveloper(List<Developer> developer) {
        this.developer = developer;
    }

    /**
     * 
     * @return
     *     The tab
     */
    @JsonProperty("tab")
    public String getTab() {
        return tab;
    }

    /**
     * 
     * @param tab
     *     The tab
     */
    @JsonProperty("tab")
    public void setTab(String tab) {
        this.tab = tab;
    }

    /**
     * 
     * @return
     *     The producer
     */
    @JsonProperty("producer")
    public Object getProducer() {
        return producer;
    }

    /**
     * 
     * @param producer
     *     The producer
     */
    @JsonProperty("producer")
    public void setProducer(Object producer) {
        this.producer = producer;
    }

    /**
     * 
     * @return
     *     The unsafe
     */
    @JsonProperty("unsafe")
    public Integer getUnsafe() {
        return unsafe;
    }

    /**
     * 
     * @param unsafe
     *     The unsafe
     */
    @JsonProperty("unsafe")
    public void setUnsafe(Integer unsafe) {
        this.unsafe = unsafe;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The devMilestone
     */
    @JsonProperty("dev_milestone")
    public String getDevMilestone() {
        return devMilestone;
    }

    /**
     * 
     * @param devMilestone
     *     The dev_milestone
     */
    @JsonProperty("dev_milestone")
    public void setDevMilestone(String devMilestone) {
        this.devMilestone = devMilestone;
    }

    /**
     * 
     * @return
     *     The topic
     */
    @JsonProperty("topic")
    public List<String> getTopic() {
        return topic;
    }

    /**
     * 
     * @param topic
     *     The topic
     */
    @JsonProperty("topic")
    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The attribution
     */
    @JsonProperty("attribution")
    public Object getAttribution() {
        return attribution;
    }

    /**
     * 
     * @param attribution
     *     The attribution
     */
    @JsonProperty("attribution")
    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    /**
     * 
     * @return
     *     The createdDate
     */
    @JsonProperty("created_date")
    public Object getCreatedDate() {
        return createdDate;
    }

    /**
     * 
     * @param createdDate
     *     The created_date
     */
    @JsonProperty("created_date")
    public void setCreatedDate(Object createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 
     * @return
     *     The exampleQuery
     */
    @JsonProperty("example_query")
    public String getExampleQuery() {
        return exampleQuery;
    }

    /**
     * 
     * @param exampleQuery
     *     The example_query
     */
    @JsonProperty("example_query")
    public void setExampleQuery(String exampleQuery) {
        this.exampleQuery = exampleQuery;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The isStackexchange
     */
    @JsonProperty("is_stackexchange")
    public Object getIsStackexchange() {
        return isStackexchange;
    }

    /**
     * 
     * @param isStackexchange
     *     The is_stackexchange
     */
    @JsonProperty("is_stackexchange")
    public void setIsStackexchange(Object isStackexchange) {
        this.isStackexchange = isStackexchange;
    }

    /**
     * 
     * @return
     *     The designer
     */
    @JsonProperty("designer")
    public Object getDesigner() {
        return designer;
    }

    /**
     * 
     * @param designer
     *     The designer
     */
    @JsonProperty("designer")
    public void setDesigner(Object designer) {
        this.designer = designer;
    }

    /**
     * 
     * @return
     *     The srcDomain
     */
    @JsonProperty("src_domain")
    public String getSrcDomain() {
        return srcDomain;
    }

    /**
     * 
     * @param srcDomain
     *     The src_domain
     */
    @JsonProperty("src_domain")
    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    /**
     * 
     * @return
     *     The srcName
     */
    @JsonProperty("src_name")
    public String getSrcName() {
        return srcName;
    }

    /**
     * 
     * @param srcName
     *     The src_name
     */
    @JsonProperty("src_name")
    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    /**
     * 
     * @return
     *     The blockgroup
     */
    @JsonProperty("blockgroup")
    public Object getBlockgroup() {
        return blockgroup;
    }

    /**
     * 
     * @param blockgroup
     *     The blockgroup
     */
    @JsonProperty("blockgroup")
    public void setBlockgroup(Object blockgroup) {
        this.blockgroup = blockgroup;
    }

    /**
     * 
     * @return
     *     The srcUrl
     */
    @JsonProperty("src_url")
    public Object getSrcUrl() {
        return srcUrl;
    }

    /**
     * 
     * @param srcUrl
     *     The src_url
     */
    @JsonProperty("src_url")
    public void setSrcUrl(Object srcUrl) {
        this.srcUrl = srcUrl;
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
