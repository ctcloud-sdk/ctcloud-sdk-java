package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 挂载到弹性云服务器上的磁盘。
 */
public class ServerExtendVolumeAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private String deleteOnTermination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootIndex")

    private String bootIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    public ServerExtendVolumeAttachment withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerExtendVolumeAttachment withDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    public String getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public ServerExtendVolumeAttachment withBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    public String getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
    }

    public ServerExtendVolumeAttachment withDevice(String device) {
        this.device = device;
        return this;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerExtendVolumeAttachment that = (ServerExtendVolumeAttachment) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.deleteOnTermination, that.deleteOnTermination)
            && Objects.equals(this.bootIndex, that.bootIndex) && Objects.equals(this.device, that.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleteOnTermination, bootIndex, device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerExtendVolumeAttachment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
        sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
