package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AttachServerVolumeOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeId")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:passthrough")

    private String hwPassthrough;

    public AttachServerVolumeOption withDevice(String device) {
        this.device = device;
        return this;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public AttachServerVolumeOption withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public AttachServerVolumeOption withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public AttachServerVolumeOption withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public AttachServerVolumeOption withHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    public String getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachServerVolumeOption that = (AttachServerVolumeOption) obj;
        return Objects.equals(this.device, that.device) && Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.count, that.count)
            && Objects.equals(this.hwPassthrough, that.hwPassthrough);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, volumeId, volumeType, count, hwPassthrough);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachServerVolumeOption {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
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
