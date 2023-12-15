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
public class PrePaidServerExtendParam {

    public static final class ChargingModeEnum {

        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargingModeEnum PREPAID = new ChargingModeEnum("prePaid");

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargingModeEnum POSTPAID = new ChargingModeEnum("postPaid");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("prePaid", PREPAID);
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionID")

    private String regionID;

    public static final class PeriodTypeEnum {

        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("month", MONTH);
            map.put("year", YEAR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodTypeEnum(String value) {
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
        public static PeriodTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private PeriodTypeEnum periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    public static final class IsAutoRenewEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoRenewEnum TRUE = new IsAutoRenewEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoRenewEnum FALSE = new IsAutoRenewEnum("false");

        private static final Map<String, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsAutoRenewEnum> createStaticFields() {
            Map<String, IsAutoRenewEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsAutoRenewEnum(String value) {
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
        public static IsAutoRenewEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoRenewEnum(value));
        }

        public static IsAutoRenewEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoRenewEnum) {
                return this.value.equals(((IsAutoRenewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private IsAutoRenewEnum isAutoRenew;

    public static final class IsAutoPayEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoPayEnum TRUE = new IsAutoPayEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoPayEnum FALSE = new IsAutoPayEnum("false");

        private static final Map<String, IsAutoPayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsAutoPayEnum> createStaticFields() {
            Map<String, IsAutoPayEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsAutoPayEnum(String value) {
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
        public static IsAutoPayEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoPayEnum(value));
        }

        public static IsAutoPayEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoPayEnum) {
                return this.value.equals(((IsAutoPayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private IsAutoPayEnum isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_auto_recovery")

    private Boolean supportAutoRecovery;

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

    public PrePaidServerExtendParam withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PrePaidServerExtendParam withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public PrePaidServerExtendParam withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public PrePaidServerExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PrePaidServerExtendParam withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public PrePaidServerExtendParam withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public PrePaidServerExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PrePaidServerExtendParam withSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
        return this;
    }

    public Boolean getSupportAutoRecovery() {
        return supportAutoRecovery;
    }

    public void setSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
    }

    public PrePaidServerExtendParam withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public PrePaidServerExtendParam withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    public String getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public PrePaidServerExtendParam withDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
        return this;
    }

    public String getDiskPrior() {
        return diskPrior;
    }

    public void setDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
    }

    public PrePaidServerExtendParam withSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
        return this;
    }

    public Integer getSpotDurationHours() {
        return spotDurationHours;
    }

    public void setSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
    }

    public PrePaidServerExtendParam withInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
        return this;
    }

    public InterruptionPolicyEnum getInterruptionPolicy() {
        return interruptionPolicy;
    }

    public void setInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
    }

    public PrePaidServerExtendParam withSpotDurationCount(Integer spotDurationCount) {
        this.spotDurationCount = spotDurationCount;
        return this;
    }

    public Integer getSpotDurationCount() {
        return spotDurationCount;
    }

    public void setSpotDurationCount(Integer spotDurationCount) {
        this.spotDurationCount = spotDurationCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrePaidServerExtendParam that = (PrePaidServerExtendParam) obj;
        return Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.regionID, that.regionID)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.supportAutoRecovery, that.supportAutoRecovery)
            && Objects.equals(this.marketType, that.marketType) && Objects.equals(this.spotPrice, that.spotPrice)
            && Objects.equals(this.diskPrior, that.diskPrior)
            && Objects.equals(this.spotDurationHours, that.spotDurationHours)
            && Objects.equals(this.interruptionPolicy, that.interruptionPolicy)
            && Objects.equals(this.spotDurationCount, that.spotDurationCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode,
            regionID,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            enterpriseProjectId,
            supportAutoRecovery,
            marketType,
            spotPrice,
            diskPrior,
            spotDurationHours,
            interruptionPolicy,
            spotDurationCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerExtendParam {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    supportAutoRecovery: ").append(toIndentedString(supportAutoRecovery)).append("\n");
        sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    diskPrior: ").append(toIndentedString(diskPrior)).append("\n");
        sb.append("    spotDurationHours: ").append(toIndentedString(spotDurationHours)).append("\n");
        sb.append("    interruptionPolicy: ").append(toIndentedString(interruptionPolicy)).append("\n");
        sb.append("    spotDurationCount: ").append(toIndentedString(spotDurationCount)).append("\n");
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
