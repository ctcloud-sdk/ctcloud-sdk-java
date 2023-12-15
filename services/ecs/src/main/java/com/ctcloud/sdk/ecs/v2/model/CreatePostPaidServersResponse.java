package com.ctcloud.sdk.ecs.v2.model;

import com.ctcloud.sdk.core.SdkResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePostPaidServersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverIds")

    private List<String> serverIds = null;

    public CreatePostPaidServersResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreatePostPaidServersResponse withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public CreatePostPaidServersResponse addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public CreatePostPaidServersResponse withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePostPaidServersResponse that = (CreatePostPaidServersResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.serverIds, that.serverIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, serverIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidServersResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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
