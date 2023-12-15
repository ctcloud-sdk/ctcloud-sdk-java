package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重装操作系统body。
 */
public class ReinstallServerWithCloudInitOption {

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
    @JsonProperty(value = "metadata")

    private ReinstallSeverMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public ReinstallServerWithCloudInitOption withAdminpass(String adminpass) {
        this.adminpass = adminpass;
        return this;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public ReinstallServerWithCloudInitOption withKeyname(String keyname) {
        this.keyname = keyname;
        return this;
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public ReinstallServerWithCloudInitOption withUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public ReinstallServerWithCloudInitOption withMetadata(ReinstallSeverMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ReinstallServerWithCloudInitOption withMetadata(Consumer<ReinstallSeverMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ReinstallSeverMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    public ReinstallSeverMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ReinstallSeverMetadata metadata) {
        this.metadata = metadata;
    }

    public ReinstallServerWithCloudInitOption withMode(String mode) {
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
        ReinstallServerWithCloudInitOption that = (ReinstallServerWithCloudInitOption) obj;
        return Objects.equals(this.adminpass, that.adminpass) && Objects.equals(this.keyname, that.keyname)
            && Objects.equals(this.userid, that.userid) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminpass, keyname, userid, metadata, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallServerWithCloudInitOption {\n");
        sb.append("    adminpass: ").append(toIndentedString(adminpass)).append("\n");
        sb.append("    keyname: ").append(toIndentedString(keyname)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
