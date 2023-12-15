package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InterfaceAttachment
 */
public class InterfaceAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ips")

    private List<ServerInterfaceFixedIp> fixedIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_addr")

    private String macAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_id")

    private String netId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_state")

    private String portState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_mode")

    private String driverMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_rate")

    private Integer minRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiqueue_num")

    private Integer multiqueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_address")

    private String pciAddress;

    public InterfaceAttachment withFixedIps(List<ServerInterfaceFixedIp> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    public InterfaceAttachment addFixedIpsItem(ServerInterfaceFixedIp fixedIpsItem) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public InterfaceAttachment withFixedIps(Consumer<List<ServerInterfaceFixedIp>> fixedIpsSetter) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    public List<ServerInterfaceFixedIp> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<ServerInterfaceFixedIp> fixedIps) {
        this.fixedIps = fixedIps;
    }

    public InterfaceAttachment withMacAddr(String macAddr) {
        this.macAddr = macAddr;
        return this;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public InterfaceAttachment withNetId(String netId) {
        this.netId = netId;
        return this;
    }

    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public InterfaceAttachment withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public InterfaceAttachment withPortState(String portState) {
        this.portState = portState;
        return this;
    }

    public String getPortState() {
        return portState;
    }

    public void setPortState(String portState) {
        this.portState = portState;
    }

    public InterfaceAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public InterfaceAttachment withDriverMode(String driverMode) {
        this.driverMode = driverMode;
        return this;
    }

    public String getDriverMode() {
        return driverMode;
    }

    public void setDriverMode(String driverMode) {
        this.driverMode = driverMode;
    }

    public InterfaceAttachment withMinRate(Integer minRate) {
        this.minRate = minRate;
        return this;
    }

    public Integer getMinRate() {
        return minRate;
    }

    public void setMinRate(Integer minRate) {
        this.minRate = minRate;
    }

    public InterfaceAttachment withMultiqueueNum(Integer multiqueueNum) {
        this.multiqueueNum = multiqueueNum;
        return this;
    }

    public Integer getMultiqueueNum() {
        return multiqueueNum;
    }

    public void setMultiqueueNum(Integer multiqueueNum) {
        this.multiqueueNum = multiqueueNum;
    }

    public InterfaceAttachment withPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
        return this;
    }

    public String getPciAddress() {
        return pciAddress;
    }

    public void setPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfaceAttachment that = (InterfaceAttachment) obj;
        return Objects.equals(this.fixedIps, that.fixedIps) && Objects.equals(this.macAddr, that.macAddr)
            && Objects.equals(this.netId, that.netId) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.portState, that.portState)
            && Objects.equals(this.deleteOnTermination, that.deleteOnTermination)
            && Objects.equals(this.driverMode, that.driverMode) && Objects.equals(this.minRate, that.minRate)
            && Objects.equals(this.multiqueueNum, that.multiqueueNum)
            && Objects.equals(this.pciAddress, that.pciAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedIps,
            macAddr,
            netId,
            portId,
            portState,
            deleteOnTermination,
            driverMode,
            minRate,
            multiqueueNum,
            pciAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterfaceAttachment {\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    portState: ").append(toIndentedString(portState)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
        sb.append("    driverMode: ").append(toIndentedString(driverMode)).append("\n");
        sb.append("    minRate: ").append(toIndentedString(minRate)).append("\n");
        sb.append("    multiqueueNum: ").append(toIndentedString(multiqueueNum)).append("\n");
        sb.append("    pciAddress: ").append(toIndentedString(pciAddress)).append("\n");
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
