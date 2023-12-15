package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 *  
 */
public class NovaCreateServersResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<NovaLink> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<NovaServerSecurityGroup> securityGroups = null;

    public static final class OsDCFDiskConfigEnum {

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");

        private static final Map<String, OsDCFDiskConfigEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsDCFDiskConfigEnum> createStaticFields() {
            Map<String, OsDCFDiskConfigEnum> map = new HashMap<>();
            map.put("MANUAL", MANUAL);
            map.put("AUTO", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsDCFDiskConfigEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsDCFDiskConfigEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsDCFDiskConfigEnum(value));
        }

        public static OsDCFDiskConfigEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsDCFDiskConfigEnum) {
                return this.value.equals(((OsDCFDiskConfigEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-DCF:diskConfig")

    private OsDCFDiskConfigEnum osDCFDiskConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reservation_id")

    private String reservationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPass")

    private String adminPass;

    public NovaCreateServersResult withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaCreateServersResult withLinks(List<NovaLink> links) {
        this.links = links;
        return this;
    }

    public NovaCreateServersResult addLinksItem(NovaLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public NovaCreateServersResult withLinks(Consumer<List<NovaLink>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    public List<NovaLink> getLinks() {
        return links;
    }

    public void setLinks(List<NovaLink> links) {
        this.links = links;
    }

    public NovaCreateServersResult withSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public NovaCreateServersResult addSecurityGroupsItem(NovaServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NovaCreateServersResult withSecurityGroups(Consumer<List<NovaServerSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<NovaServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public NovaCreateServersResult withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public NovaCreateServersResult withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public NovaCreateServersResult withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaCreateServersResult that = (NovaCreateServersResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.links, that.links)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.osDCFDiskConfig, that.osDCFDiskConfig)
            && Objects.equals(this.reservationId, that.reservationId) && Objects.equals(this.adminPass, that.adminPass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, securityGroups, osDCFDiskConfig, reservationId, adminPass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateServersResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
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
