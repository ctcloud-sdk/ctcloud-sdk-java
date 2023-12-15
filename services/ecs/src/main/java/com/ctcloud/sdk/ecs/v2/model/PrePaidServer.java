package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建弹性云服务器（包周期）接口Body体。
 */
public class PrePaidServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_terminate_time")

    private String autoTerminateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageRef")

    private String imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcid")

    private String vpcid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<PrePaidServerNic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PrePaidServerPublicip publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRename")

    private Boolean isAutoRename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private PrePaidServerRootVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<PrePaidServerDataVolume> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<PrePaidServerSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_create_in_multi_az")

    private Boolean batchCreateInMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private PrePaidServerExtendParam extendparam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os:scheduler_hints")

    private PrePaidServerSchedulerHints osSchedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_tags")

    private List<PrePaidServerTag> serverTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public PrePaidServer withAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
        return this;
    }

    public String getAutoTerminateTime() {
        return autoTerminateTime;
    }

    public void setAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
    }

    public PrePaidServer withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public PrePaidServer withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public PrePaidServer withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrePaidServer withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public PrePaidServer withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public PrePaidServer withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public PrePaidServer withVpcid(String vpcid) {
        this.vpcid = vpcid;
        return this;
    }

    public String getVpcid() {
        return vpcid;
    }

    public void setVpcid(String vpcid) {
        this.vpcid = vpcid;
    }

    public PrePaidServer withNics(List<PrePaidServerNic> nics) {
        this.nics = nics;
        return this;
    }

    public PrePaidServer addNicsItem(PrePaidServerNic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public PrePaidServer withNics(Consumer<List<PrePaidServerNic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    public List<PrePaidServerNic> getNics() {
        return nics;
    }

    public void setNics(List<PrePaidServerNic> nics) {
        this.nics = nics;
    }

    public PrePaidServer withPublicip(PrePaidServerPublicip publicip) {
        this.publicip = publicip;
        return this;
    }

    public PrePaidServer withPublicip(Consumer<PrePaidServerPublicip> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PrePaidServerPublicip();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    public PrePaidServerPublicip getPublicip() {
        return publicip;
    }

    public void setPublicip(PrePaidServerPublicip publicip) {
        this.publicip = publicip;
    }

    public PrePaidServer withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PrePaidServer withIsAutoRename(Boolean isAutoRename) {
        this.isAutoRename = isAutoRename;
        return this;
    }

    public Boolean getIsAutoRename() {
        return isAutoRename;
    }

    public void setIsAutoRename(Boolean isAutoRename) {
        this.isAutoRename = isAutoRename;
    }

    public PrePaidServer withRootVolume(PrePaidServerRootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public PrePaidServer withRootVolume(Consumer<PrePaidServerRootVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new PrePaidServerRootVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    public PrePaidServerRootVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(PrePaidServerRootVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public PrePaidServer withDataVolumes(List<PrePaidServerDataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public PrePaidServer addDataVolumesItem(PrePaidServerDataVolume dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public PrePaidServer withDataVolumes(Consumer<List<PrePaidServerDataVolume>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    public List<PrePaidServerDataVolume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<PrePaidServerDataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public PrePaidServer withSecurityGroups(List<PrePaidServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public PrePaidServer addSecurityGroupsItem(PrePaidServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public PrePaidServer withSecurityGroups(Consumer<List<PrePaidServerSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<PrePaidServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<PrePaidServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public PrePaidServer withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public PrePaidServer withBatchCreateInMultiAz(Boolean batchCreateInMultiAz) {
        this.batchCreateInMultiAz = batchCreateInMultiAz;
        return this;
    }

    public Boolean getBatchCreateInMultiAz() {
        return batchCreateInMultiAz;
    }

    public void setBatchCreateInMultiAz(Boolean batchCreateInMultiAz) {
        this.batchCreateInMultiAz = batchCreateInMultiAz;
    }

    public PrePaidServer withExtendparam(PrePaidServerExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PrePaidServer withExtendparam(Consumer<PrePaidServerExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new PrePaidServerExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    public PrePaidServerExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PrePaidServerExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public PrePaidServer withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PrePaidServer putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public PrePaidServer withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public PrePaidServer withOsSchedulerHints(PrePaidServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public PrePaidServer withOsSchedulerHints(Consumer<PrePaidServerSchedulerHints> osSchedulerHintsSetter) {
        if (this.osSchedulerHints == null) {
            this.osSchedulerHints = new PrePaidServerSchedulerHints();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }

        return this;
    }

    public PrePaidServerSchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(PrePaidServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    public PrePaidServer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public PrePaidServer addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PrePaidServer withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public PrePaidServer withServerTags(List<PrePaidServerTag> serverTags) {
        this.serverTags = serverTags;
        return this;
    }

    public PrePaidServer addServerTagsItem(PrePaidServerTag serverTagsItem) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        this.serverTags.add(serverTagsItem);
        return this;
    }

    public PrePaidServer withServerTags(Consumer<List<PrePaidServerTag>> serverTagsSetter) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        serverTagsSetter.accept(this.serverTags);
        return this;
    }

    public List<PrePaidServerTag> getServerTags() {
        return serverTags;
    }

    public void setServerTags(List<PrePaidServerTag> serverTags) {
        this.serverTags = serverTags;
    }

    public PrePaidServer withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrePaidServer that = (PrePaidServer) obj;
        return Objects.equals(this.autoTerminateTime, that.autoTerminateTime)
            && Objects.equals(this.imageRef, that.imageRef) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.name, that.name) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.adminPass, that.adminPass) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.vpcid, that.vpcid) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.publicip, that.publicip) && Objects.equals(this.count, that.count)
            && Objects.equals(this.isAutoRename, that.isAutoRename) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.batchCreateInMultiAz, that.batchCreateInMultiAz)
            && Objects.equals(this.extendparam, that.extendparam) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.osSchedulerHints, that.osSchedulerHints) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.serverTags, that.serverTags) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTerminateTime,
            imageRef,
            flavorRef,
            name,
            userData,
            adminPass,
            keyName,
            vpcid,
            nics,
            publicip,
            count,
            isAutoRename,
            rootVolume,
            dataVolumes,
            securityGroups,
            availabilityZone,
            batchCreateInMultiAz,
            extendparam,
            metadata,
            osSchedulerHints,
            tags,
            serverTags,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServer {\n");
        sb.append("    autoTerminateTime: ").append(toIndentedString(autoTerminateTime)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    vpcid: ").append(toIndentedString(vpcid)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    isAutoRename: ").append(toIndentedString(isAutoRename)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    batchCreateInMultiAz: ").append(toIndentedString(batchCreateInMultiAz)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    serverTags: ").append(toIndentedString(serverTags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
