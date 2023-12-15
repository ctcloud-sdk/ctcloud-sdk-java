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
 * 创建弹性云服务器（按需）接口Body体。
 */
public class PostPaidServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_terminate_time")

    private String autoTerminateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_create_in_multi_az")

    private Boolean batchCreateInMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<PostPaidServerDataVolume> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private PostPaidServerExtendParam extendparam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageRef")

    private String imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRename")

    private Boolean isAutoRename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<PostPaidServerNic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os:scheduler_hints")

    private PostPaidServerSchedulerHints osSchedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PostPaidServerPublicip publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private PostPaidServerRootVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<PostPaidServerSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_tags")

    private List<PostPaidServerTag> serverTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcid")

    private String vpcid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public PostPaidServer withAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
        return this;
    }

    public String getAutoTerminateTime() {
        return autoTerminateTime;
    }

    public void setAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
    }

    public PostPaidServer withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public PostPaidServer withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public PostPaidServer withBatchCreateInMultiAz(Boolean batchCreateInMultiAz) {
        this.batchCreateInMultiAz = batchCreateInMultiAz;
        return this;
    }

    public Boolean getBatchCreateInMultiAz() {
        return batchCreateInMultiAz;
    }

    public void setBatchCreateInMultiAz(Boolean batchCreateInMultiAz) {
        this.batchCreateInMultiAz = batchCreateInMultiAz;
    }

    public PostPaidServer withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PostPaidServer withDataVolumes(List<PostPaidServerDataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public PostPaidServer addDataVolumesItem(PostPaidServerDataVolume dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public PostPaidServer withDataVolumes(Consumer<List<PostPaidServerDataVolume>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    public List<PostPaidServerDataVolume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<PostPaidServerDataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public PostPaidServer withExtendparam(PostPaidServerExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PostPaidServer withExtendparam(Consumer<PostPaidServerExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new PostPaidServerExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    public PostPaidServerExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PostPaidServerExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public PostPaidServer withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public PostPaidServer withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public PostPaidServer withIsAutoRename(Boolean isAutoRename) {
        this.isAutoRename = isAutoRename;
        return this;
    }

    public Boolean getIsAutoRename() {
        return isAutoRename;
    }

    public void setIsAutoRename(Boolean isAutoRename) {
        this.isAutoRename = isAutoRename;
    }

    public PostPaidServer withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public PostPaidServer withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PostPaidServer putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public PostPaidServer withMetadata(Consumer<Map<String, String>> metadataSetter) {
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

    public PostPaidServer withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostPaidServer withNics(List<PostPaidServerNic> nics) {
        this.nics = nics;
        return this;
    }

    public PostPaidServer addNicsItem(PostPaidServerNic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public PostPaidServer withNics(Consumer<List<PostPaidServerNic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    public List<PostPaidServerNic> getNics() {
        return nics;
    }

    public void setNics(List<PostPaidServerNic> nics) {
        this.nics = nics;
    }

    public PostPaidServer withOsSchedulerHints(PostPaidServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public PostPaidServer withOsSchedulerHints(Consumer<PostPaidServerSchedulerHints> osSchedulerHintsSetter) {
        if (this.osSchedulerHints == null) {
            this.osSchedulerHints = new PostPaidServerSchedulerHints();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }

        return this;
    }

    public PostPaidServerSchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(PostPaidServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    public PostPaidServer withPublicip(PostPaidServerPublicip publicip) {
        this.publicip = publicip;
        return this;
    }

    public PostPaidServer withPublicip(Consumer<PostPaidServerPublicip> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PostPaidServerPublicip();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    public PostPaidServerPublicip getPublicip() {
        return publicip;
    }

    public void setPublicip(PostPaidServerPublicip publicip) {
        this.publicip = publicip;
    }

    public PostPaidServer withRootVolume(PostPaidServerRootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public PostPaidServer withRootVolume(Consumer<PostPaidServerRootVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new PostPaidServerRootVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    public PostPaidServerRootVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(PostPaidServerRootVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public PostPaidServer withSecurityGroups(List<PostPaidServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public PostPaidServer addSecurityGroupsItem(PostPaidServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public PostPaidServer withSecurityGroups(Consumer<List<PostPaidServerSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<PostPaidServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<PostPaidServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public PostPaidServer withServerTags(List<PostPaidServerTag> serverTags) {
        this.serverTags = serverTags;
        return this;
    }

    public PostPaidServer addServerTagsItem(PostPaidServerTag serverTagsItem) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        this.serverTags.add(serverTagsItem);
        return this;
    }

    public PostPaidServer withServerTags(Consumer<List<PostPaidServerTag>> serverTagsSetter) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        serverTagsSetter.accept(this.serverTags);
        return this;
    }

    public List<PostPaidServerTag> getServerTags() {
        return serverTags;
    }

    public void setServerTags(List<PostPaidServerTag> serverTags) {
        this.serverTags = serverTags;
    }

    public PostPaidServer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public PostPaidServer addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PostPaidServer withTags(Consumer<List<String>> tagsSetter) {
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

    public PostPaidServer withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public PostPaidServer withVpcid(String vpcid) {
        this.vpcid = vpcid;
        return this;
    }

    public String getVpcid() {
        return vpcid;
    }

    public void setVpcid(String vpcid) {
        this.vpcid = vpcid;
    }

    public PostPaidServer withDescription(String description) {
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
        PostPaidServer that = (PostPaidServer) obj;
        return Objects.equals(this.autoTerminateTime, that.autoTerminateTime)
            && Objects.equals(this.adminPass, that.adminPass)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.batchCreateInMultiAz, that.batchCreateInMultiAz)
            && Objects.equals(this.count, that.count) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.extendparam, that.extendparam) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.imageRef, that.imageRef) && Objects.equals(this.isAutoRename, that.isAutoRename)
            && Objects.equals(this.keyName, that.keyName) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.osSchedulerHints, that.osSchedulerHints)
            && Objects.equals(this.publicip, that.publicip) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.serverTags, that.serverTags) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.userData, that.userData) && Objects.equals(this.vpcid, that.vpcid)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTerminateTime,
            adminPass,
            availabilityZone,
            batchCreateInMultiAz,
            count,
            dataVolumes,
            extendparam,
            flavorRef,
            imageRef,
            isAutoRename,
            keyName,
            metadata,
            name,
            nics,
            osSchedulerHints,
            publicip,
            rootVolume,
            securityGroups,
            serverTags,
            tags,
            userData,
            vpcid,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServer {\n");
        sb.append("    autoTerminateTime: ").append(toIndentedString(autoTerminateTime)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    batchCreateInMultiAz: ").append(toIndentedString(batchCreateInMultiAz)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    isAutoRename: ").append(toIndentedString(isAutoRename)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    serverTags: ").append(toIndentedString(serverTags)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    vpcid: ").append(toIndentedString(vpcid)).append("\n");
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
