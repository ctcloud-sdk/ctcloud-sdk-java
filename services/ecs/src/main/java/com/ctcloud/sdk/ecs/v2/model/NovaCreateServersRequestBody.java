package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class NovaCreateServersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private NovaCreateServersOption server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os:scheduler_hints")

    private NovaCreateServersSchedulerHint osSchedulerHints;

    public NovaCreateServersRequestBody withServer(NovaCreateServersOption server) {
        this.server = server;
        return this;
    }

    public NovaCreateServersRequestBody withServer(Consumer<NovaCreateServersOption> serverSetter) {
        if (this.server == null) {
            this.server = new NovaCreateServersOption();
            serverSetter.accept(this.server);
        }

        return this;
    }

    public NovaCreateServersOption getServer() {
        return server;
    }

    public void setServer(NovaCreateServersOption server) {
        this.server = server;
    }

    public NovaCreateServersRequestBody withOsSchedulerHints(NovaCreateServersSchedulerHint osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public NovaCreateServersRequestBody withOsSchedulerHints(
        Consumer<NovaCreateServersSchedulerHint> osSchedulerHintsSetter) {
        if (this.osSchedulerHints == null) {
            this.osSchedulerHints = new NovaCreateServersSchedulerHint();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }

        return this;
    }

    public NovaCreateServersSchedulerHint getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(NovaCreateServersSchedulerHint osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaCreateServersRequestBody that = (NovaCreateServersRequestBody) obj;
        return Objects.equals(this.server, that.server) && Objects.equals(this.osSchedulerHints, that.osSchedulerHints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, osSchedulerHints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateServersRequestBody {\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
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
