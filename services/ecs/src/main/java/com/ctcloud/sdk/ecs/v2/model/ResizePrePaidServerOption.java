package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ResizePrePaidServerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private ResizeServerExtendParam extendparam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public ResizePrePaidServerOption withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public ResizePrePaidServerOption withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public ResizePrePaidServerOption withExtendparam(ResizeServerExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public ResizePrePaidServerOption withExtendparam(Consumer<ResizeServerExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new ResizeServerExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    public ResizeServerExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(ResizeServerExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public ResizePrePaidServerOption withMode(String mode) {
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
        ResizePrePaidServerOption that = (ResizePrePaidServerOption) obj;
        return Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.dedicatedHostId, that.dedicatedHostId)
            && Objects.equals(this.extendparam, that.extendparam) && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, dedicatedHostId, extendparam, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizePrePaidServerOption {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
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
