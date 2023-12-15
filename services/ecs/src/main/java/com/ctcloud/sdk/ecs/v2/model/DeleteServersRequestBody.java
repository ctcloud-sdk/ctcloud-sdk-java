package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class DeleteServersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_publicip")

    private Boolean deletePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_volume")

    private Boolean deleteVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<ServerId> servers = null;

    public DeleteServersRequestBody withDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
        return this;
    }

    public Boolean getDeletePublicip() {
        return deletePublicip;
    }

    public void setDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
    }

    public DeleteServersRequestBody withDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
        return this;
    }

    public Boolean getDeleteVolume() {
        return deleteVolume;
    }

    public void setDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
    }

    public DeleteServersRequestBody withServers(List<ServerId> servers) {
        this.servers = servers;
        return this;
    }

    public DeleteServersRequestBody addServersItem(ServerId serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public DeleteServersRequestBody withServers(Consumer<List<ServerId>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    public List<ServerId> getServers() {
        return servers;
    }

    public void setServers(List<ServerId> servers) {
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
        DeleteServersRequestBody that = (DeleteServersRequestBody) obj;
        return Objects.equals(this.deletePublicip, that.deletePublicip)
            && Objects.equals(this.deleteVolume, that.deleteVolume) && Objects.equals(this.servers, that.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deletePublicip, deleteVolume, servers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteServersRequestBody {\n");
        sb.append("    deletePublicip: ").append(toIndentedString(deletePublicip)).append("\n");
        sb.append("    deleteVolume: ").append(toIndentedString(deleteVolume)).append("\n");
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
