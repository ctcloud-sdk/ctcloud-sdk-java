package com.ctcloud.sdk.ecs.v2.model;

import com.ctcloud.sdk.core.SdkResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowServerAutoRecoveryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_auto_recovery")

    private String supportAutoRecovery;

    public ShowServerAutoRecoveryResponse withSupportAutoRecovery(String supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
        return this;
    }

    public String getSupportAutoRecovery() {
        return supportAutoRecovery;
    }

    public void setSupportAutoRecovery(String supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerAutoRecoveryResponse that = (ShowServerAutoRecoveryResponse) obj;
        return Objects.equals(this.supportAutoRecovery, that.supportAutoRecovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportAutoRecovery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerAutoRecoveryResponse {\n");
        sb.append("    supportAutoRecovery: ").append(toIndentedString(supportAutoRecovery)).append("\n");
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
