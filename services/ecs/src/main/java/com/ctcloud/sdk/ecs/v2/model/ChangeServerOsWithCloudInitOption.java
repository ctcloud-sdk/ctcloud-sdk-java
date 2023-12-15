package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重装操作系统body体。
 */
public class ChangeServerOsWithCloudInitOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminpass")

    private String adminpass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyname")

    private String keyname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userid")

    private String userid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageid")

    private String imageid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ChangeSeversOsMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public ChangeServerOsWithCloudInitOption withAdminpass(String adminpass) {
        this.adminpass = adminpass;
        return this;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public ChangeServerOsWithCloudInitOption withKeyname(String keyname) {
        this.keyname = keyname;
        return this;
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public ChangeServerOsWithCloudInitOption withUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public ChangeServerOsWithCloudInitOption withImageid(String imageid) {
        this.imageid = imageid;
        return this;
    }

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public ChangeServerOsWithCloudInitOption withMetadata(ChangeSeversOsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ChangeServerOsWithCloudInitOption withMetadata(Consumer<ChangeSeversOsMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ChangeSeversOsMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public ChangeSeversOsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ChangeSeversOsMetadata metadata) {
        this.metadata = metadata;
    }

    public ChangeServerOsWithCloudInitOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeServerOsWithCloudInitOption that = (ChangeServerOsWithCloudInitOption) obj;
        return Objects.equals(this.adminpass, that.adminpass) && Objects.equals(this.keyname, that.keyname)
            && Objects.equals(this.userid, that.userid) && Objects.equals(this.imageid, that.imageid)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminpass, keyname, userid, imageid, metadata, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerOsWithCloudInitOption {\n");
        sb.append("    adminpass: ").append(toIndentedString(adminpass)).append("\n");
        sb.append("    keyname: ").append(toIndentedString(keyname)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    imageid: ").append(toIndentedString(imageid)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
