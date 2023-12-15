package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务器详情。
 */
public class ServerDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_terminate_time")

    private String autoTerminateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostId")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:host")

    private String osEXTSRVATTRHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<ServerAddress>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private ServerImage image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:task_state")

    private String osEXTSTSTaskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:vm_state")

    private String osEXTSTSVmState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:instance_name")

    private String osEXTSRVATTRInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hypervisor_hostname")

    private String osEXTSRVATTRHypervisorHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private ServerFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<ServerSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-AZ:availability_zone")

    private String osEXTAZAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-DCF:diskConfig")

    private String osDCFDiskConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv4")

    private String accessIPv4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessIPv6")

    private String accessIPv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault")

    private ServerFault fault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:power_state")

    private Integer osEXTSTSPowerState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_drive")

    private String configDrive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:launched_at")

    private String osSRVUSGLaunchedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:terminated_at")

    private String osSRVUSGTerminatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-extended-volumes:volumes_attached")

    private List<ServerExtendVolumeAttachment> osExtendedVolumesVolumesAttached = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hostname")

    private String osEXTSRVATTRHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:reservation_id")

    private String osEXTSRVATTRReservationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:launch_index")

    private Integer osEXTSRVATTRLaunchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:kernel_id")

    private String osEXTSRVATTRKernelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:ramdisk_id")

    private String osEXTSRVATTRRamdiskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:root_device_name")

    private String osEXTSRVATTRRootDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:user_data")

    private String osEXTSRVATTRUserData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os:scheduler_hints")

    private ServerSchedulerHints osSchedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<ServerSystemTag> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_options")

    private CpuOptions cpuOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hypervisor")

    private Hypervisor hypervisor;

    public ServerDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServerDetail withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ServerDetail withAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
        return this;
    }

    public String getAutoTerminateTime() {
        return autoTerminateTime;
    }

    public void setAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
    }

    public ServerDetail withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ServerDetail withOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
        return this;
    }

    public String getOsEXTSRVATTRHost() {
        return osEXTSRVATTRHost;
    }

    public void setOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
    }

    public ServerDetail withAddresses(Map<String, List<ServerAddress>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public ServerDetail putAddressesItem(String key, List<ServerAddress> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public ServerDetail withAddresses(Consumer<Map<String, List<ServerAddress>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    public Map<String, List<ServerAddress>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<ServerAddress>> addresses) {
        this.addresses = addresses;
    }

    public ServerDetail withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public ServerDetail withImage(ServerImage image) {
        this.image = image;
        return this;
    }

    public ServerDetail withImage(Consumer<ServerImage> imageSetter) {
        if (this.image == null) {
            this.image = new ServerImage();
            imageSetter.accept(this.image);
        }

        return this;
    }

    public ServerImage getImage() {
        return image;
    }

    public void setImage(ServerImage image) {
        this.image = image;
    }

    public ServerDetail withOsEXTSTSTaskState(String osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
        return this;
    }

    public String getOsEXTSTSTaskState() {
        return osEXTSTSTaskState;
    }

    public void setOsEXTSTSTaskState(String osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
    }

    public ServerDetail withOsEXTSTSVmState(String osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
        return this;
    }

    public String getOsEXTSTSVmState() {
        return osEXTSTSVmState;
    }

    public void setOsEXTSTSVmState(String osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
    }

    public ServerDetail withOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
        return this;
    }

    public String getOsEXTSRVATTRInstanceName() {
        return osEXTSRVATTRInstanceName;
    }

    public void setOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
    }

    public ServerDetail withOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
        return this;
    }

    public String getOsEXTSRVATTRHypervisorHostname() {
        return osEXTSRVATTRHypervisorHostname;
    }

    public void setOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
    }

    public ServerDetail withFlavor(ServerFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public ServerDetail withFlavor(Consumer<ServerFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ServerFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    public ServerFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(ServerFlavor flavor) {
        this.flavor = flavor;
    }

    public ServerDetail withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerDetail withSecurityGroups(List<ServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ServerDetail addSecurityGroupsItem(ServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ServerDetail withSecurityGroups(Consumer<List<ServerSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    public List<ServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<ServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ServerDetail withOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
        return this;
    }

    public String getOsEXTAZAvailabilityZone() {
        return osEXTAZAvailabilityZone;
    }

    public void setOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
    }

    public ServerDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ServerDetail withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ServerDetail withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ServerDetail withOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    public String getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public ServerDetail withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public ServerDetail withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public ServerDetail withFault(ServerFault fault) {
        this.fault = fault;
        return this;
    }

    public ServerDetail withFault(Consumer<ServerFault> faultSetter) {
        if (this.fault == null) {
            this.fault = new ServerFault();
            faultSetter.accept(this.fault);
        }

        return this;
    }

    public ServerFault getFault() {
        return fault;
    }

    public void setFault(ServerFault fault) {
        this.fault = fault;
    }

    public ServerDetail withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ServerDetail withOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
        return this;
    }

    public Integer getOsEXTSTSPowerState() {
        return osEXTSTSPowerState;
    }

    public void setOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
    }

    public ServerDetail withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    public ServerDetail withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public ServerDetail putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public ServerDetail withMetadata(Consumer<Map<String, String>> metadataSetter) {
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

    public ServerDetail withOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
        return this;
    }

    public String getOsSRVUSGLaunchedAt() {
        return osSRVUSGLaunchedAt;
    }

    public void setOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
    }

    public ServerDetail withOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
        return this;
    }

    public String getOsSRVUSGTerminatedAt() {
        return osSRVUSGTerminatedAt;
    }

    public void setOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
    }

    public ServerDetail withOsExtendedVolumesVolumesAttached(
        List<ServerExtendVolumeAttachment> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
        return this;
    }

    public ServerDetail addOsExtendedVolumesVolumesAttachedItem(
        ServerExtendVolumeAttachment osExtendedVolumesVolumesAttachedItem) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        this.osExtendedVolumesVolumesAttached.add(osExtendedVolumesVolumesAttachedItem);
        return this;
    }

    public ServerDetail withOsExtendedVolumesVolumesAttached(
        Consumer<List<ServerExtendVolumeAttachment>> osExtendedVolumesVolumesAttachedSetter) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        osExtendedVolumesVolumesAttachedSetter.accept(this.osExtendedVolumesVolumesAttached);
        return this;
    }

    public List<ServerExtendVolumeAttachment> getOsExtendedVolumesVolumesAttached() {
        return osExtendedVolumesVolumesAttached;
    }

    public void setOsExtendedVolumesVolumesAttached(
        List<ServerExtendVolumeAttachment> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
    }

    public ServerDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServerDetail withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ServerDetail withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    public ServerDetail withOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
        return this;
    }

    public String getOsEXTSRVATTRReservationId() {
        return osEXTSRVATTRReservationId;
    }

    public void setOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
    }

    public ServerDetail withOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
        return this;
    }

    public Integer getOsEXTSRVATTRLaunchIndex() {
        return osEXTSRVATTRLaunchIndex;
    }

    public void setOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
    }

    public ServerDetail withOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
        return this;
    }

    public String getOsEXTSRVATTRKernelId() {
        return osEXTSRVATTRKernelId;
    }

    public void setOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
    }

    public ServerDetail withOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
        return this;
    }

    public String getOsEXTSRVATTRRamdiskId() {
        return osEXTSRVATTRRamdiskId;
    }

    public void setOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
    }

    public ServerDetail withOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
        return this;
    }

    public String getOsEXTSRVATTRRootDeviceName() {
        return osEXTSRVATTRRootDeviceName;
    }

    public void setOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
    }

    public ServerDetail withOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
        return this;
    }

    public String getOsEXTSRVATTRUserData() {
        return osEXTSRVATTRUserData;
    }

    public void setOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
    }

    public ServerDetail withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public ServerDetail withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ServerDetail addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ServerDetail withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ServerDetail withOsSchedulerHints(ServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public ServerDetail withOsSchedulerHints(Consumer<ServerSchedulerHints> osSchedulerHintsSetter) {
        if (this.osSchedulerHints == null) {
            this.osSchedulerHints = new ServerSchedulerHints();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }

        return this;
    }

    public ServerSchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(ServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    public ServerDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ServerDetail withSysTags(List<ServerSystemTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ServerDetail addSysTagsItem(ServerSystemTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ServerDetail withSysTags(Consumer<List<ServerSystemTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    public List<ServerSystemTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ServerSystemTag> sysTags) {
        this.sysTags = sysTags;
    }

    public ServerDetail withCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    public ServerDetail withCpuOptions(Consumer<CpuOptions> cpuOptionsSetter) {
        if (this.cpuOptions == null) {
            this.cpuOptions = new CpuOptions();
            cpuOptionsSetter.accept(this.cpuOptions);
        }

        return this;
    }

    public CpuOptions getCpuOptions() {
        return cpuOptions;
    }

    public void setCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    public ServerDetail withHypervisor(Hypervisor hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    public ServerDetail withHypervisor(Consumer<Hypervisor> hypervisorSetter) {
        if (this.hypervisor == null) {
            this.hypervisor = new Hypervisor();
            hypervisorSetter.accept(this.hypervisor);
        }

        return this;
    }

    public Hypervisor getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(Hypervisor hypervisor) {
        this.hypervisor = hypervisor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerDetail that = (ServerDetail) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.autoTerminateTime, that.autoTerminateTime)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.osEXTSRVATTRHost, that.osEXTSRVATTRHost)
            && Objects.equals(this.addresses, that.addresses) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.image, that.image) && Objects.equals(this.osEXTSTSTaskState, that.osEXTSTSTaskState)
            && Objects.equals(this.osEXTSTSVmState, that.osEXTSTSVmState)
            && Objects.equals(this.osEXTSRVATTRInstanceName, that.osEXTSRVATTRInstanceName)
            && Objects.equals(this.osEXTSRVATTRHypervisorHostname, that.osEXTSRVATTRHypervisorHostname)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.id, that.id)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.osEXTAZAvailabilityZone, that.osEXTAZAvailabilityZone)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.created, that.created) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.osDCFDiskConfig, that.osDCFDiskConfig)
            && Objects.equals(this.accessIPv4, that.accessIPv4) && Objects.equals(this.accessIPv6, that.accessIPv6)
            && Objects.equals(this.fault, that.fault) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.osEXTSTSPowerState, that.osEXTSTSPowerState)
            && Objects.equals(this.configDrive, that.configDrive) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.osSRVUSGLaunchedAt, that.osSRVUSGLaunchedAt)
            && Objects.equals(this.osSRVUSGTerminatedAt, that.osSRVUSGTerminatedAt)
            && Objects.equals(this.osExtendedVolumesVolumesAttached, that.osExtendedVolumesVolumesAttached)
            && Objects.equals(this.description, that.description) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.osEXTSRVATTRHostname, that.osEXTSRVATTRHostname)
            && Objects.equals(this.osEXTSRVATTRReservationId, that.osEXTSRVATTRReservationId)
            && Objects.equals(this.osEXTSRVATTRLaunchIndex, that.osEXTSRVATTRLaunchIndex)
            && Objects.equals(this.osEXTSRVATTRKernelId, that.osEXTSRVATTRKernelId)
            && Objects.equals(this.osEXTSRVATTRRamdiskId, that.osEXTSRVATTRRamdiskId)
            && Objects.equals(this.osEXTSRVATTRRootDeviceName, that.osEXTSRVATTRRootDeviceName)
            && Objects.equals(this.osEXTSRVATTRUserData, that.osEXTSRVATTRUserData)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.osSchedulerHints, that.osSchedulerHints)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.sysTags, that.sysTags) && Objects.equals(this.cpuOptions, that.cpuOptions)
            && Objects.equals(this.hypervisor, that.hypervisor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            updated,
            autoTerminateTime,
            hostId,
            osEXTSRVATTRHost,
            addresses,
            keyName,
            image,
            osEXTSTSTaskState,
            osEXTSTSVmState,
            osEXTSRVATTRInstanceName,
            osEXTSRVATTRHypervisorHostname,
            flavor,
            id,
            securityGroups,
            osEXTAZAvailabilityZone,
            userId,
            name,
            created,
            tenantId,
            osDCFDiskConfig,
            accessIPv4,
            accessIPv6,
            fault,
            progress,
            osEXTSTSPowerState,
            configDrive,
            metadata,
            osSRVUSGLaunchedAt,
            osSRVUSGTerminatedAt,
            osExtendedVolumesVolumesAttached,
            description,
            hostStatus,
            osEXTSRVATTRHostname,
            osEXTSRVATTRReservationId,
            osEXTSRVATTRLaunchIndex,
            osEXTSRVATTRKernelId,
            osEXTSRVATTRRamdiskId,
            osEXTSRVATTRRootDeviceName,
            osEXTSRVATTRUserData,
            locked,
            tags,
            osSchedulerHints,
            enterpriseProjectId,
            sysTags,
            cpuOptions,
            hypervisor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerDetail {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    autoTerminateTime: ").append(toIndentedString(autoTerminateTime)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    osEXTSRVATTRHost: ").append(toIndentedString(osEXTSRVATTRHost)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    osEXTSTSTaskState: ").append(toIndentedString(osEXTSTSTaskState)).append("\n");
        sb.append("    osEXTSTSVmState: ").append(toIndentedString(osEXTSTSVmState)).append("\n");
        sb.append("    osEXTSRVATTRInstanceName: ").append(toIndentedString(osEXTSRVATTRInstanceName)).append("\n");
        sb.append("    osEXTSRVATTRHypervisorHostname: ")
            .append(toIndentedString(osEXTSRVATTRHypervisorHostname))
            .append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    osEXTAZAvailabilityZone: ").append(toIndentedString(osEXTAZAvailabilityZone)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
        sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    osEXTSTSPowerState: ").append(toIndentedString(osEXTSTSPowerState)).append("\n");
        sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    osSRVUSGLaunchedAt: ").append(toIndentedString(osSRVUSGLaunchedAt)).append("\n");
        sb.append("    osSRVUSGTerminatedAt: ").append(toIndentedString(osSRVUSGTerminatedAt)).append("\n");
        sb.append("    osExtendedVolumesVolumesAttached: ")
            .append(toIndentedString(osExtendedVolumesVolumesAttached))
            .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
        sb.append("    osEXTSRVATTRReservationId: ").append(toIndentedString(osEXTSRVATTRReservationId)).append("\n");
        sb.append("    osEXTSRVATTRLaunchIndex: ").append(toIndentedString(osEXTSRVATTRLaunchIndex)).append("\n");
        sb.append("    osEXTSRVATTRKernelId: ").append(toIndentedString(osEXTSRVATTRKernelId)).append("\n");
        sb.append("    osEXTSRVATTRRamdiskId: ").append(toIndentedString(osEXTSRVATTRRamdiskId)).append("\n");
        sb.append("    osEXTSRVATTRRootDeviceName: ").append(toIndentedString(osEXTSRVATTRRootDeviceName)).append("\n");
        sb.append("    osEXTSRVATTRUserData: ").append(toIndentedString(osEXTSRVATTRUserData)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    cpuOptions: ").append(toIndentedString(cpuOptions)).append("\n");
        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
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
