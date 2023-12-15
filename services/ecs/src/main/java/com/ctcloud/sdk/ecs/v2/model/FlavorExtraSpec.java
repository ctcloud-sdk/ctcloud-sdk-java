package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器规格的扩展字段。
 */
public class FlavorExtraSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:performancetype")

    private String ecsPerformancetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:numa_nodes")

    private String hwNumaNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpet_support")

    private String hpetSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_vnic:type")

    private String instanceVnicType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_vnic:instance_bandwidth")

    private String instanceVnicInstanceBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_vnic:max_count")

    private String instanceVnicMaxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:local_disk")

    private String quotaLocalDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:nvme_ssd")

    private String quotaNvmeSsd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_spec:io:persistent_grant")

    private String extraSpecIoPersistentGrant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:generation")

    private String ecsGeneration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:virtualization_env_types")

    private String ecsVirtualizationEnvTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:enable_gpu")

    private String pciPassthroughEnableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:gpu_specs")

    private String pciPassthroughGpuSpecs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:alias")

    private String pciPassthroughAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:status")

    private String condOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:az")

    private String condOperationAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:max_rate")

    private String quotaMaxRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:min_rate")

    private String quotaMinRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:max_pps")

    private String quotaMaxPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:charge")

    private String condOperationCharge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:charge:stop")

    private String condOperationChargeStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:spot:operation:az")

    private String condSpotOperationAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:roles")

    private String condOperationRoles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:spot:operation:status")

    private String condSpotOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:network")

    private String condNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:storage")

    private String condStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:compute:live_resizable")

    private String condComputeLiveResizable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:compute")

    private String condCompute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:gpu:name")

    private String infoGpuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:cpu:name")

    private String infoCpuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:gpu")

    private String quotaGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:instance_architecture")

    private String ecsInstanceArchitecture;

    public FlavorExtraSpec withEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
        return this;
    }

    public String getEcsPerformancetype() {
        return ecsPerformancetype;
    }

    public void setEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
    }

    public FlavorExtraSpec withHwNumaNodes(String hwNumaNodes) {
        this.hwNumaNodes = hwNumaNodes;
        return this;
    }

    public String getHwNumaNodes() {
        return hwNumaNodes;
    }

    public void setHwNumaNodes(String hwNumaNodes) {
        this.hwNumaNodes = hwNumaNodes;
    }

    public FlavorExtraSpec withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public FlavorExtraSpec withHpetSupport(String hpetSupport) {
        this.hpetSupport = hpetSupport;
        return this;
    }

    public String getHpetSupport() {
        return hpetSupport;
    }

    public void setHpetSupport(String hpetSupport) {
        this.hpetSupport = hpetSupport;
    }

    public FlavorExtraSpec withInstanceVnicType(String instanceVnicType) {
        this.instanceVnicType = instanceVnicType;
        return this;
    }

    public String getInstanceVnicType() {
        return instanceVnicType;
    }

    public void setInstanceVnicType(String instanceVnicType) {
        this.instanceVnicType = instanceVnicType;
    }

    public FlavorExtraSpec withInstanceVnicInstanceBandwidth(String instanceVnicInstanceBandwidth) {
        this.instanceVnicInstanceBandwidth = instanceVnicInstanceBandwidth;
        return this;
    }

    public String getInstanceVnicInstanceBandwidth() {
        return instanceVnicInstanceBandwidth;
    }

    public void setInstanceVnicInstanceBandwidth(String instanceVnicInstanceBandwidth) {
        this.instanceVnicInstanceBandwidth = instanceVnicInstanceBandwidth;
    }

    public FlavorExtraSpec withInstanceVnicMaxCount(String instanceVnicMaxCount) {
        this.instanceVnicMaxCount = instanceVnicMaxCount;
        return this;
    }

    public String getInstanceVnicMaxCount() {
        return instanceVnicMaxCount;
    }

    public void setInstanceVnicMaxCount(String instanceVnicMaxCount) {
        this.instanceVnicMaxCount = instanceVnicMaxCount;
    }

    public FlavorExtraSpec withQuotaLocalDisk(String quotaLocalDisk) {
        this.quotaLocalDisk = quotaLocalDisk;
        return this;
    }

    public String getQuotaLocalDisk() {
        return quotaLocalDisk;
    }

    public void setQuotaLocalDisk(String quotaLocalDisk) {
        this.quotaLocalDisk = quotaLocalDisk;
    }

    public FlavorExtraSpec withQuotaNvmeSsd(String quotaNvmeSsd) {
        this.quotaNvmeSsd = quotaNvmeSsd;
        return this;
    }

    public String getQuotaNvmeSsd() {
        return quotaNvmeSsd;
    }

    public void setQuotaNvmeSsd(String quotaNvmeSsd) {
        this.quotaNvmeSsd = quotaNvmeSsd;
    }

    public FlavorExtraSpec withExtraSpecIoPersistentGrant(String extraSpecIoPersistentGrant) {
        this.extraSpecIoPersistentGrant = extraSpecIoPersistentGrant;
        return this;
    }

    public String getExtraSpecIoPersistentGrant() {
        return extraSpecIoPersistentGrant;
    }

    public void setExtraSpecIoPersistentGrant(String extraSpecIoPersistentGrant) {
        this.extraSpecIoPersistentGrant = extraSpecIoPersistentGrant;
    }

    public FlavorExtraSpec withEcsGeneration(String ecsGeneration) {
        this.ecsGeneration = ecsGeneration;
        return this;
    }

    public String getEcsGeneration() {
        return ecsGeneration;
    }

    public void setEcsGeneration(String ecsGeneration) {
        this.ecsGeneration = ecsGeneration;
    }

    public FlavorExtraSpec withEcsVirtualizationEnvTypes(String ecsVirtualizationEnvTypes) {
        this.ecsVirtualizationEnvTypes = ecsVirtualizationEnvTypes;
        return this;
    }

    public String getEcsVirtualizationEnvTypes() {
        return ecsVirtualizationEnvTypes;
    }

    public void setEcsVirtualizationEnvTypes(String ecsVirtualizationEnvTypes) {
        this.ecsVirtualizationEnvTypes = ecsVirtualizationEnvTypes;
    }

    public FlavorExtraSpec withPciPassthroughEnableGpu(String pciPassthroughEnableGpu) {
        this.pciPassthroughEnableGpu = pciPassthroughEnableGpu;
        return this;
    }

    public String getPciPassthroughEnableGpu() {
        return pciPassthroughEnableGpu;
    }

    public void setPciPassthroughEnableGpu(String pciPassthroughEnableGpu) {
        this.pciPassthroughEnableGpu = pciPassthroughEnableGpu;
    }

    public FlavorExtraSpec withPciPassthroughGpuSpecs(String pciPassthroughGpuSpecs) {
        this.pciPassthroughGpuSpecs = pciPassthroughGpuSpecs;
        return this;
    }

    public String getPciPassthroughGpuSpecs() {
        return pciPassthroughGpuSpecs;
    }

    public void setPciPassthroughGpuSpecs(String pciPassthroughGpuSpecs) {
        this.pciPassthroughGpuSpecs = pciPassthroughGpuSpecs;
    }

    public FlavorExtraSpec withPciPassthroughAlias(String pciPassthroughAlias) {
        this.pciPassthroughAlias = pciPassthroughAlias;
        return this;
    }

    public String getPciPassthroughAlias() {
        return pciPassthroughAlias;
    }

    public void setPciPassthroughAlias(String pciPassthroughAlias) {
        this.pciPassthroughAlias = pciPassthroughAlias;
    }

    public FlavorExtraSpec withCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
        return this;
    }

    public String getCondOperationStatus() {
        return condOperationStatus;
    }

    public void setCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
    }

    public FlavorExtraSpec withCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
        return this;
    }

    public String getCondOperationAz() {
        return condOperationAz;
    }

    public void setCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
    }

    public FlavorExtraSpec withQuotaMaxRate(String quotaMaxRate) {
        this.quotaMaxRate = quotaMaxRate;
        return this;
    }

    public String getQuotaMaxRate() {
        return quotaMaxRate;
    }

    public void setQuotaMaxRate(String quotaMaxRate) {
        this.quotaMaxRate = quotaMaxRate;
    }

    public FlavorExtraSpec withQuotaMinRate(String quotaMinRate) {
        this.quotaMinRate = quotaMinRate;
        return this;
    }

    public String getQuotaMinRate() {
        return quotaMinRate;
    }

    public void setQuotaMinRate(String quotaMinRate) {
        this.quotaMinRate = quotaMinRate;
    }

    public FlavorExtraSpec withQuotaMaxPps(String quotaMaxPps) {
        this.quotaMaxPps = quotaMaxPps;
        return this;
    }

    public String getQuotaMaxPps() {
        return quotaMaxPps;
    }

    public void setQuotaMaxPps(String quotaMaxPps) {
        this.quotaMaxPps = quotaMaxPps;
    }

    public FlavorExtraSpec withCondOperationCharge(String condOperationCharge) {
        this.condOperationCharge = condOperationCharge;
        return this;
    }

    public String getCondOperationCharge() {
        return condOperationCharge;
    }

    public void setCondOperationCharge(String condOperationCharge) {
        this.condOperationCharge = condOperationCharge;
    }

    public FlavorExtraSpec withCondOperationChargeStop(String condOperationChargeStop) {
        this.condOperationChargeStop = condOperationChargeStop;
        return this;
    }

    public String getCondOperationChargeStop() {
        return condOperationChargeStop;
    }

    public void setCondOperationChargeStop(String condOperationChargeStop) {
        this.condOperationChargeStop = condOperationChargeStop;
    }

    public FlavorExtraSpec withCondSpotOperationAz(String condSpotOperationAz) {
        this.condSpotOperationAz = condSpotOperationAz;
        return this;
    }

    public String getCondSpotOperationAz() {
        return condSpotOperationAz;
    }

    public void setCondSpotOperationAz(String condSpotOperationAz) {
        this.condSpotOperationAz = condSpotOperationAz;
    }

    public FlavorExtraSpec withCondOperationRoles(String condOperationRoles) {
        this.condOperationRoles = condOperationRoles;
        return this;
    }

    public String getCondOperationRoles() {
        return condOperationRoles;
    }

    public void setCondOperationRoles(String condOperationRoles) {
        this.condOperationRoles = condOperationRoles;
    }

    public FlavorExtraSpec withCondSpotOperationStatus(String condSpotOperationStatus) {
        this.condSpotOperationStatus = condSpotOperationStatus;
        return this;
    }

    public String getCondSpotOperationStatus() {
        return condSpotOperationStatus;
    }

    public void setCondSpotOperationStatus(String condSpotOperationStatus) {
        this.condSpotOperationStatus = condSpotOperationStatus;
    }

    public FlavorExtraSpec withCondNetwork(String condNetwork) {
        this.condNetwork = condNetwork;
        return this;
    }

    public String getCondNetwork() {
        return condNetwork;
    }

    public void setCondNetwork(String condNetwork) {
        this.condNetwork = condNetwork;
    }

    public FlavorExtraSpec withCondStorage(String condStorage) {
        this.condStorage = condStorage;
        return this;
    }

    public String getCondStorage() {
        return condStorage;
    }

    public void setCondStorage(String condStorage) {
        this.condStorage = condStorage;
    }

    public FlavorExtraSpec withCondComputeLiveResizable(String condComputeLiveResizable) {
        this.condComputeLiveResizable = condComputeLiveResizable;
        return this;
    }

    public String getCondComputeLiveResizable() {
        return condComputeLiveResizable;
    }

    public void setCondComputeLiveResizable(String condComputeLiveResizable) {
        this.condComputeLiveResizable = condComputeLiveResizable;
    }

    public FlavorExtraSpec withCondCompute(String condCompute) {
        this.condCompute = condCompute;
        return this;
    }

    public String getCondCompute() {
        return condCompute;
    }

    public void setCondCompute(String condCompute) {
        this.condCompute = condCompute;
    }

    public FlavorExtraSpec withInfoGpuName(String infoGpuName) {
        this.infoGpuName = infoGpuName;
        return this;
    }

    public String getInfoGpuName() {
        return infoGpuName;
    }

    public void setInfoGpuName(String infoGpuName) {
        this.infoGpuName = infoGpuName;
    }

    public FlavorExtraSpec withInfoCpuName(String infoCpuName) {
        this.infoCpuName = infoCpuName;
        return this;
    }

    public String getInfoCpuName() {
        return infoCpuName;
    }

    public void setInfoCpuName(String infoCpuName) {
        this.infoCpuName = infoCpuName;
    }

    public FlavorExtraSpec withQuotaGpu(String quotaGpu) {
        this.quotaGpu = quotaGpu;
        return this;
    }

    public String getQuotaGpu() {
        return quotaGpu;
    }

    public void setQuotaGpu(String quotaGpu) {
        this.quotaGpu = quotaGpu;
    }

    public FlavorExtraSpec withEcsInstanceArchitecture(String ecsInstanceArchitecture) {
        this.ecsInstanceArchitecture = ecsInstanceArchitecture;
        return this;
    }

    public String getEcsInstanceArchitecture() {
        return ecsInstanceArchitecture;
    }

    public void setEcsInstanceArchitecture(String ecsInstanceArchitecture) {
        this.ecsInstanceArchitecture = ecsInstanceArchitecture;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorExtraSpec that = (FlavorExtraSpec) obj;
        return Objects.equals(this.ecsPerformancetype, that.ecsPerformancetype)
            && Objects.equals(this.hwNumaNodes, that.hwNumaNodes)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.hpetSupport, that.hpetSupport)
            && Objects.equals(this.instanceVnicType, that.instanceVnicType)
            && Objects.equals(this.instanceVnicInstanceBandwidth, that.instanceVnicInstanceBandwidth)
            && Objects.equals(this.instanceVnicMaxCount, that.instanceVnicMaxCount)
            && Objects.equals(this.quotaLocalDisk, that.quotaLocalDisk)
            && Objects.equals(this.quotaNvmeSsd, that.quotaNvmeSsd)
            && Objects.equals(this.extraSpecIoPersistentGrant, that.extraSpecIoPersistentGrant)
            && Objects.equals(this.ecsGeneration, that.ecsGeneration)
            && Objects.equals(this.ecsVirtualizationEnvTypes, that.ecsVirtualizationEnvTypes)
            && Objects.equals(this.pciPassthroughEnableGpu, that.pciPassthroughEnableGpu)
            && Objects.equals(this.pciPassthroughGpuSpecs, that.pciPassthroughGpuSpecs)
            && Objects.equals(this.pciPassthroughAlias, that.pciPassthroughAlias)
            && Objects.equals(this.condOperationStatus, that.condOperationStatus)
            && Objects.equals(this.condOperationAz, that.condOperationAz)
            && Objects.equals(this.quotaMaxRate, that.quotaMaxRate)
            && Objects.equals(this.quotaMinRate, that.quotaMinRate)
            && Objects.equals(this.quotaMaxPps, that.quotaMaxPps)
            && Objects.equals(this.condOperationCharge, that.condOperationCharge)
            && Objects.equals(this.condOperationChargeStop, that.condOperationChargeStop)
            && Objects.equals(this.condSpotOperationAz, that.condSpotOperationAz)
            && Objects.equals(this.condOperationRoles, that.condOperationRoles)
            && Objects.equals(this.condSpotOperationStatus, that.condSpotOperationStatus)
            && Objects.equals(this.condNetwork, that.condNetwork) && Objects.equals(this.condStorage, that.condStorage)
            && Objects.equals(this.condComputeLiveResizable, that.condComputeLiveResizable)
            && Objects.equals(this.condCompute, that.condCompute) && Objects.equals(this.infoGpuName, that.infoGpuName)
            && Objects.equals(this.infoCpuName, that.infoCpuName) && Objects.equals(this.quotaGpu, that.quotaGpu)
            && Objects.equals(this.ecsInstanceArchitecture, that.ecsInstanceArchitecture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecsPerformancetype,
            hwNumaNodes,
            resourceType,
            hpetSupport,
            instanceVnicType,
            instanceVnicInstanceBandwidth,
            instanceVnicMaxCount,
            quotaLocalDisk,
            quotaNvmeSsd,
            extraSpecIoPersistentGrant,
            ecsGeneration,
            ecsVirtualizationEnvTypes,
            pciPassthroughEnableGpu,
            pciPassthroughGpuSpecs,
            pciPassthroughAlias,
            condOperationStatus,
            condOperationAz,
            quotaMaxRate,
            quotaMinRate,
            quotaMaxPps,
            condOperationCharge,
            condOperationChargeStop,
            condSpotOperationAz,
            condOperationRoles,
            condSpotOperationStatus,
            condNetwork,
            condStorage,
            condComputeLiveResizable,
            condCompute,
            infoGpuName,
            infoCpuName,
            quotaGpu,
            ecsInstanceArchitecture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorExtraSpec {\n");
        sb.append("    ecsPerformancetype: ").append(toIndentedString(ecsPerformancetype)).append("\n");
        sb.append("    hwNumaNodes: ").append(toIndentedString(hwNumaNodes)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    hpetSupport: ").append(toIndentedString(hpetSupport)).append("\n");
        sb.append("    instanceVnicType: ").append(toIndentedString(instanceVnicType)).append("\n");
        sb.append("    instanceVnicInstanceBandwidth: ")
            .append(toIndentedString(instanceVnicInstanceBandwidth))
            .append("\n");
        sb.append("    instanceVnicMaxCount: ").append(toIndentedString(instanceVnicMaxCount)).append("\n");
        sb.append("    quotaLocalDisk: ").append(toIndentedString(quotaLocalDisk)).append("\n");
        sb.append("    quotaNvmeSsd: ").append(toIndentedString(quotaNvmeSsd)).append("\n");
        sb.append("    extraSpecIoPersistentGrant: ").append(toIndentedString(extraSpecIoPersistentGrant)).append("\n");
        sb.append("    ecsGeneration: ").append(toIndentedString(ecsGeneration)).append("\n");
        sb.append("    ecsVirtualizationEnvTypes: ").append(toIndentedString(ecsVirtualizationEnvTypes)).append("\n");
        sb.append("    pciPassthroughEnableGpu: ").append(toIndentedString(pciPassthroughEnableGpu)).append("\n");
        sb.append("    pciPassthroughGpuSpecs: ").append(toIndentedString(pciPassthroughGpuSpecs)).append("\n");
        sb.append("    pciPassthroughAlias: ").append(toIndentedString(pciPassthroughAlias)).append("\n");
        sb.append("    condOperationStatus: ").append(toIndentedString(condOperationStatus)).append("\n");
        sb.append("    condOperationAz: ").append(toIndentedString(condOperationAz)).append("\n");
        sb.append("    quotaMaxRate: ").append(toIndentedString(quotaMaxRate)).append("\n");
        sb.append("    quotaMinRate: ").append(toIndentedString(quotaMinRate)).append("\n");
        sb.append("    quotaMaxPps: ").append(toIndentedString(quotaMaxPps)).append("\n");
        sb.append("    condOperationCharge: ").append(toIndentedString(condOperationCharge)).append("\n");
        sb.append("    condOperationChargeStop: ").append(toIndentedString(condOperationChargeStop)).append("\n");
        sb.append("    condSpotOperationAz: ").append(toIndentedString(condSpotOperationAz)).append("\n");
        sb.append("    condOperationRoles: ").append(toIndentedString(condOperationRoles)).append("\n");
        sb.append("    condSpotOperationStatus: ").append(toIndentedString(condSpotOperationStatus)).append("\n");
        sb.append("    condNetwork: ").append(toIndentedString(condNetwork)).append("\n");
        sb.append("    condStorage: ").append(toIndentedString(condStorage)).append("\n");
        sb.append("    condComputeLiveResizable: ").append(toIndentedString(condComputeLiveResizable)).append("\n");
        sb.append("    condCompute: ").append(toIndentedString(condCompute)).append("\n");
        sb.append("    infoGpuName: ").append(toIndentedString(infoGpuName)).append("\n");
        sb.append("    infoCpuName: ").append(toIndentedString(infoCpuName)).append("\n");
        sb.append("    quotaGpu: ").append(toIndentedString(quotaGpu)).append("\n");
        sb.append("    ecsInstanceArchitecture: ").append(toIndentedString(ecsInstanceArchitecture)).append("\n");
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
