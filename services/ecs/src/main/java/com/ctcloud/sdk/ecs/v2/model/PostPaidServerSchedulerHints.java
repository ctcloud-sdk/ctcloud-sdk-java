package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class PostPaidServerSchedulerHints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private String tenancy;

    public PostPaidServerSchedulerHints withGroup(String group) {
        this.group = group;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PostPaidServerSchedulerHints withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public PostPaidServerSchedulerHints withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostPaidServerSchedulerHints that = (PostPaidServerSchedulerHints) obj;
        return Objects.equals(this.group, that.group) && Objects.equals(this.dedicatedHostId, that.dedicatedHostId)
            && Objects.equals(this.tenancy, that.tenancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, dedicatedHostId, tenancy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerSchedulerHints {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
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
