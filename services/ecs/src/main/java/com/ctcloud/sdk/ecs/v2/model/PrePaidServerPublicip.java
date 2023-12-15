package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PrePaidServerPublicip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private PrePaidServerEip eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    public PrePaidServerPublicip withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrePaidServerPublicip withEip(PrePaidServerEip eip) {
        this.eip = eip;
        return this;
    }

    public PrePaidServerPublicip withEip(Consumer<PrePaidServerEip> eipSetter) {
        if (this.eip == null) {
            this.eip = new PrePaidServerEip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    public PrePaidServerEip getEip() {
        return eip;
    }

    public void setEip(PrePaidServerEip eip) {
        this.eip = eip;
    }

    public PrePaidServerPublicip withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrePaidServerPublicip that = (PrePaidServerPublicip) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.deleteOnTermination, that.deleteOnTermination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eip, deleteOnTermination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerPublicip {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
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
