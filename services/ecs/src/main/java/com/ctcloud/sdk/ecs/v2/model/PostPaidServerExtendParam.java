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
 * 
 */
public class PostPaidServerExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionID")

    private String regionID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_auto_recovery")

    private Boolean supportAutoRecovery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marketType")

    private String marketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spotPrice")

    private String spotPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskPrior")

    private String diskPrior;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_duration_hours")

    private Integer spotDurationHours;

    public static final class InterruptionPolicyEnum {

        /**
         * Enum IMMEDIATE for value: "immediate"
         */
        public static final InterruptionPolicyEnum IMMEDIATE = new InterruptionPolicyEnum("immediate");

        private static final Map<String, InterruptionPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InterruptionPolicyEnum> createStaticFields() {
            Map<String, InterruptionPolicyEnum> map = new HashMap<>();
            map.put("immediate", IMMEDIATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InterruptionPolicyEnum(String value) {
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
        public static InterruptionPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InterruptionPolicyEnum(value));
        }

        public static InterruptionPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InterruptionPolicyEnum) {
                return this.value.equals(((InterruptionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interruption_policy")

    private InterruptionPolicyEnum interruptionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_duration_count")

    private Integer spotDurationCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CB_CSBS_BACKUP")

    private String cbCsbsBackup;

    public PostPaidServerExtendParam withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PostPaidServerExtendParam withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public PostPaidServerExtendParam withSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
        return this;
    }

    public Boolean getSupportAutoRecovery() {
        return supportAutoRecovery;
    }

    public void setSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
    }

    public PostPaidServerExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PostPaidServerExtendParam withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public PostPaidServerExtendParam withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    public String getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public PostPaidServerExtendParam withDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
        return this;
    }

    public String getDiskPrior() {
        return diskPrior;
    }

    public void setDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
    }

    public PostPaidServerExtendParam withSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
        return this;
    }

    public Integer getSpotDurationHours() {
        return spotDurationHours;
    }

    public void setSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
    }

    public PostPaidServerExtendParam withInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
        return this;
    }

    public InterruptionPolicyEnum getInterruptionPolicy() {
        return interruptionPolicy;
    }

    public void setInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
    }

    public PostPaidServerExtendParam withSpotDurationCount(Integer spotDurationCount) {
        this.spotDurationCount = spotDurationCount;
        return this;
    }

    public Integer getSpotDurationCount() {
        return spotDurationCount;
    }

    public void setSpotDurationCount(Integer spotDurationCount) {
        this.spotDurationCount = spotDurationCount;
    }

    public PostPaidServerExtendParam withCbCsbsBackup(String cbCsbsBackup) {
        this.cbCsbsBackup = cbCsbsBackup;
        return this;
    }

    public String getCbCsbsBackup() {
        return cbCsbsBackup;
    }

    public void setCbCsbsBackup(String cbCsbsBackup) {
        this.cbCsbsBackup = cbCsbsBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostPaidServerExtendParam that = (PostPaidServerExtendParam) obj;
        return Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.regionID, that.regionID)
            && Objects.equals(this.supportAutoRecovery, that.supportAutoRecovery)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.marketType, that.marketType) && Objects.equals(this.spotPrice, that.spotPrice)
            && Objects.equals(this.diskPrior, that.diskPrior)
            && Objects.equals(this.spotDurationHours, that.spotDurationHours)
            && Objects.equals(this.interruptionPolicy, that.interruptionPolicy)
            && Objects.equals(this.spotDurationCount, that.spotDurationCount)
            && Objects.equals(this.cbCsbsBackup, that.cbCsbsBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode,
            regionID,
            supportAutoRecovery,
            enterpriseProjectId,
            marketType,
            spotPrice,
            diskPrior,
            spotDurationHours,
            interruptionPolicy,
            spotDurationCount,
            cbCsbsBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerExtendParam {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
        sb.append("    supportAutoRecovery: ").append(toIndentedString(supportAutoRecovery)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    diskPrior: ").append(toIndentedString(diskPrior)).append("\n");
        sb.append("    spotDurationHours: ").append(toIndentedString(spotDurationHours)).append("\n");
        sb.append("    interruptionPolicy: ").append(toIndentedString(interruptionPolicy)).append("\n");
        sb.append("    spotDurationCount: ").append(toIndentedString(spotDurationCount)).append("\n");
        sb.append("    cbCsbsBackup: ").append(toIndentedString(cbCsbsBackup)).append("\n");
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
