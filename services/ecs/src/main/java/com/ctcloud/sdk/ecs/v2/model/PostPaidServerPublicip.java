package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PostPaidServerPublicip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private PostPaidServerEip eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    public PostPaidServerPublicip withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PostPaidServerPublicip withEip(PostPaidServerEip eip) {
        this.eip = eip;
        return this;
    }

    public PostPaidServerPublicip withEip(Consumer<PostPaidServerEip> eipSetter) {
        if (this.eip == null) {
            this.eip = new PostPaidServerEip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    public PostPaidServerEip getEip() {
        return eip;
    }

    public void setEip(PostPaidServerEip eip) {
        this.eip = eip;
    }

    public PostPaidServerPublicip withDeleteOnTermination(Boolean deleteOnTermination) {
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
        PostPaidServerPublicip that = (PostPaidServerPublicip) obj;
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
        sb.append("class PostPaidServerPublicip {\n");
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
