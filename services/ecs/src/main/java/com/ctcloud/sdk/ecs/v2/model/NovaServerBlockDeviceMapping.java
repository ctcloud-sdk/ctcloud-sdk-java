package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *  扩展属性，指定弹性云服务器存储设备的v2接口。是存储资源的新版本接口，指定卷场景不能批创弹性云服务器。  裸金属服务器场景不支持。
 */
public class NovaServerBlockDeviceMapping {

    public static final class SourceTypeEnum {

        /**
         * Enum BLANK for value: "blank"
         */
        public static final SourceTypeEnum BLANK = new SourceTypeEnum("blank");

        /**
         * Enum SNAPSHOT for value: "snapshot"
         */
        public static final SourceTypeEnum SNAPSHOT = new SourceTypeEnum("snapshot");

        /**
         * Enum VOLUME for value: "volume"
         */
        public static final SourceTypeEnum VOLUME = new SourceTypeEnum("volume");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final SourceTypeEnum IMAGE = new SourceTypeEnum("image");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("blank", BLANK);
            map.put("snapshot", SNAPSHOT);
            map.put("volume", VOLUME);
            map.put("image", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    public static final class DestinationTypeEnum {

        /**
         * Enum VOLUME for value: "volume"
         */
        public static final DestinationTypeEnum VOLUME = new DestinationTypeEnum("volume");

        private static final Map<String, DestinationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DestinationTypeEnum> createStaticFields() {
            Map<String, DestinationTypeEnum> map = new HashMap<>();
            map.put("volume", VOLUME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DestinationTypeEnum(String value) {
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
        public static DestinationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DestinationTypeEnum(value));
        }

        public static DestinationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DestinationTypeEnum) {
                return this.value.equals(((DestinationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private DestinationTypeEnum destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guest_format")

    private String guestFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_index")

    private String bootIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    public NovaServerBlockDeviceMapping withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public NovaServerBlockDeviceMapping withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public NovaServerBlockDeviceMapping withGuestFormat(String guestFormat) {
        this.guestFormat = guestFormat;
        return this;
    }

    public String getGuestFormat() {
        return guestFormat;
    }

    public void setGuestFormat(String guestFormat) {
        this.guestFormat = guestFormat;
    }

    public NovaServerBlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public NovaServerBlockDeviceMapping withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public NovaServerBlockDeviceMapping withBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    public String getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
    }

    public NovaServerBlockDeviceMapping withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public NovaServerBlockDeviceMapping withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public NovaServerBlockDeviceMapping withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaServerBlockDeviceMapping that = (NovaServerBlockDeviceMapping) obj;
        return Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.guestFormat, that.guestFormat) && Objects.equals(this.deviceName, that.deviceName)
            && Objects.equals(this.deleteOnTermination, that.deleteOnTermination)
            && Objects.equals(this.bootIndex, that.bootIndex) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.volumeSize, that.volumeSize) && Objects.equals(this.volumeType, that.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType,
            destinationType,
            guestFormat,
            deviceName,
            deleteOnTermination,
            bootIndex,
            uuid,
            volumeSize,
            volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerBlockDeviceMapping {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    guestFormat: ").append(toIndentedString(guestFormat)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
        sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
