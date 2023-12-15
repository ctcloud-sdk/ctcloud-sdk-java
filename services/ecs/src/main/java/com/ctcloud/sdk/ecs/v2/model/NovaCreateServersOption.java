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
 *  弹性云服务器信息
 */
public class NovaCreateServersOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_terminate_time")

    private String autoTerminateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageRef")

    private String imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_device_mapping_v2")

    private List<NovaServerBlockDeviceMapping> blockDeviceMappingV2 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_drive")

    private String configDrive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<NovaServerSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<NovaServerNetwork> networks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_reservation_id")

    private Boolean returnReservationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_count")

    private Integer minCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_count")

    private Integer maxCount;

    public static final class OsDCFDiskConfigEnum {

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");

        private static final Map<String, OsDCFDiskConfigEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsDCFDiskConfigEnum> createStaticFields() {
            Map<String, OsDCFDiskConfigEnum> map = new HashMap<>();
            map.put("AUTO", AUTO);
            map.put("MANUAL", MANUAL);
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
    @JsonProperty(value = "description")

    private String description;

    public NovaCreateServersOption withAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
        return this;
    }

    public String getAutoTerminateTime() {
        return autoTerminateTime;
    }

    public void setAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
    }

    public NovaCreateServersOption withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public NovaCreateServersOption withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public NovaCreateServersOption withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NovaCreateServersOption withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public NovaCreateServersOption putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public NovaCreateServersOption withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public NovaCreateServersOption withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public NovaCreateServersOption withBlockDeviceMappingV2(List<NovaServerBlockDeviceMapping> blockDeviceMappingV2) {
        this.blockDeviceMappingV2 = blockDeviceMappingV2;
        return this;
    }

    public NovaCreateServersOption addBlockDeviceMappingV2Item(NovaServerBlockDeviceMapping blockDeviceMappingV2Item) {
        if (this.blockDeviceMappingV2 == null) {
            this.blockDeviceMappingV2 = new ArrayList<>();
        }
        this.blockDeviceMappingV2.add(blockDeviceMappingV2Item);
        return this;
    }

    public NovaCreateServersOption withBlockDeviceMappingV2(
        Consumer<List<NovaServerBlockDeviceMapping>> blockDeviceMappingV2Setter) {
        if (this.blockDeviceMappingV2 == null) {
            this.blockDeviceMappingV2 = new ArrayList<>();
        }
        blockDeviceMappingV2Setter.accept(this.blockDeviceMappingV2);
        return this;
    }

    public List<NovaServerBlockDeviceMapping> getBlockDeviceMappingV2() {
        return blockDeviceMappingV2;
    }

    public void setBlockDeviceMappingV2(List<NovaServerBlockDeviceMapping> blockDeviceMappingV2) {
        this.blockDeviceMappingV2 = blockDeviceMappingV2;
    }

    public NovaCreateServersOption withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    public NovaCreateServersOption withSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public NovaCreateServersOption addSecurityGroupsItem(NovaServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NovaCreateServersOption withSecurityGroups(Consumer<List<NovaServerSecurityGroup>> securityGroupsSetter) {
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

    public NovaCreateServersOption withNetworks(List<NovaServerNetwork> networks) {
        this.networks = networks;
        return this;
    }

    public NovaCreateServersOption addNetworksItem(NovaServerNetwork networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public NovaCreateServersOption withNetworks(Consumer<List<NovaServerNetwork>> networksSetter) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    public List<NovaServerNetwork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NovaServerNetwork> networks) {
        this.networks = networks;
    }

    public NovaCreateServersOption withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public NovaCreateServersOption withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public NovaCreateServersOption withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public NovaCreateServersOption withReturnReservationId(Boolean returnReservationId) {
        this.returnReservationId = returnReservationId;
        return this;
    }

    public Boolean getReturnReservationId() {
        return returnReservationId;
    }

    public void setReturnReservationId(Boolean returnReservationId) {
        this.returnReservationId = returnReservationId;
    }

    public NovaCreateServersOption withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    public Integer getMinCount() {
        return minCount;
    }

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    public NovaCreateServersOption withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public NovaCreateServersOption withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public NovaCreateServersOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaCreateServersOption that = (NovaCreateServersOption) obj;
        return Objects.equals(this.autoTerminateTime, that.autoTerminateTime)
            && Objects.equals(this.imageRef, that.imageRef) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.name, that.name) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.adminPass, that.adminPass)
            && Objects.equals(this.blockDeviceMappingV2, that.blockDeviceMappingV2)
            && Objects.equals(this.configDrive, that.configDrive)
            && Objects.equals(this.securityGroups, that.securityGroups) && Objects.equals(this.networks, that.networks)
            && Objects.equals(this.keyName, that.keyName) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.returnReservationId, that.returnReservationId)
            && Objects.equals(this.minCount, that.minCount) && Objects.equals(this.maxCount, that.maxCount)
            && Objects.equals(this.osDCFDiskConfig, that.osDCFDiskConfig)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTerminateTime,
            imageRef,
            flavorRef,
            name,
            metadata,
            adminPass,
            blockDeviceMappingV2,
            configDrive,
            securityGroups,
            networks,
            keyName,
            userData,
            availabilityZone,
            returnReservationId,
            minCount,
            maxCount,
            osDCFDiskConfig,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateServersOption {\n");
        sb.append("    autoTerminateTime: ").append(toIndentedString(autoTerminateTime)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    blockDeviceMappingV2: ").append(toIndentedString(blockDeviceMappingV2)).append("\n");
        sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    returnReservationId: ").append(toIndentedString(returnReservationId)).append("\n");
        sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
        sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
