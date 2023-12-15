package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class AttachServerVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeAttachment")

    private AttachServerVolumeOption volumeAttachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public AttachServerVolumeRequestBody withVolumeAttachment(AttachServerVolumeOption volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
        return this;
    }

    public AttachServerVolumeRequestBody withVolumeAttachment(
        Consumer<AttachServerVolumeOption> volumeAttachmentSetter) {
        if (this.volumeAttachment == null) {
            this.volumeAttachment = new AttachServerVolumeOption();
            volumeAttachmentSetter.accept(this.volumeAttachment);
        }

        return this;
    }

    public AttachServerVolumeOption getVolumeAttachment() {
        return volumeAttachment;
    }

    public void setVolumeAttachment(AttachServerVolumeOption volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
    }

    public AttachServerVolumeRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachServerVolumeRequestBody that = (AttachServerVolumeRequestBody) obj;
        return Objects.equals(this.volumeAttachment, that.volumeAttachment) && Objects.equals(this.dryRun, that.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeAttachment, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachServerVolumeRequestBody {\n");
        sb.append("    volumeAttachment: ").append(toIndentedString(volumeAttachment)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
