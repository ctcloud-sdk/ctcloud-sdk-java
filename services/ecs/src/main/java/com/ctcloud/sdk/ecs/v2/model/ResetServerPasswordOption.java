package com.ctcloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetServerPasswordOption
 */
public class ResetServerPasswordOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_check_password")

    private Boolean isCheckPassword;

    public ResetServerPasswordOption withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public ResetServerPasswordOption withIsCheckPassword(Boolean isCheckPassword) {
        this.isCheckPassword = isCheckPassword;
        return this;
    }

    public Boolean getIsCheckPassword() {
        return isCheckPassword;
    }

    public void setIsCheckPassword(Boolean isCheckPassword) {
        this.isCheckPassword = isCheckPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetServerPasswordOption that = (ResetServerPasswordOption) obj;
        return Objects.equals(this.newPassword, that.newPassword)
            && Objects.equals(this.isCheckPassword, that.isCheckPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword, isCheckPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetServerPasswordOption {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    isCheckPassword: ").append(toIndentedString(isCheckPassword)).append("\n");
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
