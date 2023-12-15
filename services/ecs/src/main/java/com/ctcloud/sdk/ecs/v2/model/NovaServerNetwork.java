package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class NovaServerNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ip")

    private String fixedIp;

    public NovaServerNetwork withPort(String port) {
        this.port = port;
        return this;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public NovaServerNetwork withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public NovaServerNetwork withFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
        return this;
    }

    public String getFixedIp() {
        return fixedIp;
    }

    public void setFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaServerNetwork that = (NovaServerNetwork) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.fixedIp, that.fixedIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, uuid, fixedIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerNetwork {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    fixedIp: ").append(toIndentedString(fixedIp)).append("\n");
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
