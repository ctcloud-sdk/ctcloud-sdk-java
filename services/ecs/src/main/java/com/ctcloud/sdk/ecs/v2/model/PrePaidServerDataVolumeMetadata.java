package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * &gt; 说明： &gt;  &gt; 如果是从镜像创建云硬盘，则不支持传入“__system__encrypted”和“__system__cmkid”字段，创建出来的云硬盘与镜像的加密属性一致。
 */
public class PrePaidServerDataVolumeMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")

    private String systemEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")

    private String systemCmkid;

    public PrePaidServerDataVolumeMetadata withSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")
    public String getSystemEncrypted() {
        return systemEncrypted;
    }

    public void setSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
    }

    public PrePaidServerDataVolumeMetadata withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrePaidServerDataVolumeMetadata that = (PrePaidServerDataVolumeMetadata) obj;
        return Objects.equals(this.systemEncrypted, that.systemEncrypted)
            && Objects.equals(this.systemCmkid, that.systemCmkid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemEncrypted, systemCmkid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerDataVolumeMetadata {\n");
        sb.append("    systemEncrypted: ").append(toIndentedString(systemEncrypted)).append("\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
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
