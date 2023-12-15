package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateServersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private PrePaidServer server;

    public CreateServersRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreateServersRequestBody withServer(PrePaidServer server) {
        this.server = server;
        return this;
    }

    public CreateServersRequestBody withServer(Consumer<PrePaidServer> serverSetter) {
        if (this.server == null) {
            this.server = new PrePaidServer();
            serverSetter.accept(this.server);
        }

        return this;
    }

    public PrePaidServer getServer() {
        return server;
    }

    public void setServer(PrePaidServer server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServersRequestBody that = (CreateServersRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.server, that.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServersRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
