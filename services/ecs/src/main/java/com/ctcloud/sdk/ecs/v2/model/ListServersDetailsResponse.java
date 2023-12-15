package com.ctcloud.sdk.ecs.v2.model;

import com.ctcloud.sdk.core.SdkResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListServersDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<ServerDetail> servers = null;

    public ListServersDetailsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListServersDetailsResponse withServers(List<ServerDetail> servers) {
        this.servers = servers;
        return this;
    }

    public ListServersDetailsResponse addServersItem(ServerDetail serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ListServersDetailsResponse withServers(Consumer<List<ServerDetail>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    public List<ServerDetail> getServers() {
        return servers;
    }

    public void setServers(List<ServerDetail> servers) {
        this.servers = servers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServersDetailsResponse that = (ListServersDetailsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.servers, that.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, servers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersDetailsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
