package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性云服务器调度信息。
 */
public class ServerSchedulerHints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private List<String> group = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private List<String> tenancy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private List<String> dedicatedHostId = null;

    public ServerSchedulerHints withGroup(List<String> group) {
        this.group = group;
        return this;
    }

    public ServerSchedulerHints addGroupItem(String groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    public ServerSchedulerHints withGroup(Consumer<List<String>> groupSetter) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        groupSetter.accept(this.group);
        return this;
    }

    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public ServerSchedulerHints withTenancy(List<String> tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    public ServerSchedulerHints addTenancyItem(String tenancyItem) {
        if (this.tenancy == null) {
            this.tenancy = new ArrayList<>();
        }
        this.tenancy.add(tenancyItem);
        return this;
    }

    public ServerSchedulerHints withTenancy(Consumer<List<String>> tenancySetter) {
        if (this.tenancy == null) {
            this.tenancy = new ArrayList<>();
        }
        tenancySetter.accept(this.tenancy);
        return this;
    }

    public List<String> getTenancy() {
        return tenancy;
    }

    public void setTenancy(List<String> tenancy) {
        this.tenancy = tenancy;
    }

    public ServerSchedulerHints withDedicatedHostId(List<String> dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public ServerSchedulerHints addDedicatedHostIdItem(String dedicatedHostIdItem) {
        if (this.dedicatedHostId == null) {
            this.dedicatedHostId = new ArrayList<>();
        }
        this.dedicatedHostId.add(dedicatedHostIdItem);
        return this;
    }

    public ServerSchedulerHints withDedicatedHostId(Consumer<List<String>> dedicatedHostIdSetter) {
        if (this.dedicatedHostId == null) {
            this.dedicatedHostId = new ArrayList<>();
        }
        dedicatedHostIdSetter.accept(this.dedicatedHostId);
        return this;
    }

    public List<String> getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(List<String> dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerSchedulerHints that = (ServerSchedulerHints) obj;
        return Objects.equals(this.group, that.group) && Objects.equals(this.tenancy, that.tenancy)
            && Objects.equals(this.dedicatedHostId, that.dedicatedHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, tenancy, dedicatedHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerSchedulerHints {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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
