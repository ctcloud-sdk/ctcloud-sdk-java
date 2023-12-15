package com.ctcloud.sdk.ecs.v2;

import com.ctcloud.sdk.core.ClientBuilder;
import com.ctcloud.sdk.core.HcClient;
import com.ctcloud.sdk.core.invoker.AsyncInvoker;
import com.ctcloud.sdk.ecs.v2.model.AddServerGroupMemberRequest;
import com.ctcloud.sdk.ecs.v2.model.AddServerGroupMemberResponse;
import com.ctcloud.sdk.ecs.v2.model.AssociateServerVirtualIpRequest;
import com.ctcloud.sdk.ecs.v2.model.AssociateServerVirtualIpResponse;
import com.ctcloud.sdk.ecs.v2.model.AttachServerVolumeRequest;
import com.ctcloud.sdk.ecs.v2.model.AttachServerVolumeResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchAddServerNicsRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchAddServerNicsResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchAttachSharableVolumesRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchAttachSharableVolumesResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchCreateServerTagsRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchCreateServerTagsResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchDeleteServerNicsRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchDeleteServerNicsResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchDeleteServerTagsRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchDeleteServerTagsResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchRebootServersRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchRebootServersResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchResetServersPasswordRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchResetServersPasswordResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchStartServersRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchStartServersResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchStopServersRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchStopServersResponse;
import com.ctcloud.sdk.ecs.v2.model.BatchUpdateServersNameRequest;
import com.ctcloud.sdk.ecs.v2.model.BatchUpdateServersNameResponse;
import com.ctcloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitRequest;
import com.ctcloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitResponse;
import com.ctcloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitRequest;
import com.ctcloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitResponse;
import com.ctcloud.sdk.ecs.v2.model.CreatePostPaidServersRequest;
import com.ctcloud.sdk.ecs.v2.model.CreatePostPaidServersResponse;
import com.ctcloud.sdk.ecs.v2.model.CreateServerGroupRequest;
import com.ctcloud.sdk.ecs.v2.model.CreateServerGroupResponse;
import com.ctcloud.sdk.ecs.v2.model.CreateServersRequest;
import com.ctcloud.sdk.ecs.v2.model.CreateServersResponse;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerGroupMemberRequest;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerGroupMemberResponse;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerGroupRequest;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerGroupResponse;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerMetadataRequest;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerMetadataResponse;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerPasswordRequest;
import com.ctcloud.sdk.ecs.v2.model.DeleteServerPasswordResponse;
import com.ctcloud.sdk.ecs.v2.model.DeleteServersRequest;
import com.ctcloud.sdk.ecs.v2.model.DeleteServersResponse;
import com.ctcloud.sdk.ecs.v2.model.DetachServerVolumeRequest;
import com.ctcloud.sdk.ecs.v2.model.DetachServerVolumeResponse;
import com.ctcloud.sdk.ecs.v2.model.DisassociateServerVirtualIpRequest;
import com.ctcloud.sdk.ecs.v2.model.DisassociateServerVirtualIpResponse;
import com.ctcloud.sdk.ecs.v2.model.ListFlavorsRequest;
import com.ctcloud.sdk.ecs.v2.model.ListFlavorsResponse;
import com.ctcloud.sdk.ecs.v2.model.ListResizeFlavorsRequest;
import com.ctcloud.sdk.ecs.v2.model.ListResizeFlavorsResponse;
import com.ctcloud.sdk.ecs.v2.model.ListServerBlockDevicesRequest;
import com.ctcloud.sdk.ecs.v2.model.ListServerBlockDevicesResponse;
import com.ctcloud.sdk.ecs.v2.model.ListServerGroupsRequest;
import com.ctcloud.sdk.ecs.v2.model.ListServerGroupsResponse;
import com.ctcloud.sdk.ecs.v2.model.ListServerInterfacesRequest;
import com.ctcloud.sdk.ecs.v2.model.ListServerInterfacesResponse;
import com.ctcloud.sdk.ecs.v2.model.ListServerTagsRequest;
import com.ctcloud.sdk.ecs.v2.model.ListServerTagsResponse;
import com.ctcloud.sdk.ecs.v2.model.ListServersDetailsRequest;
import com.ctcloud.sdk.ecs.v2.model.ListServersDetailsResponse;
import com.ctcloud.sdk.ecs.v2.model.MigrateServerRequest;
import com.ctcloud.sdk.ecs.v2.model.MigrateServerResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaAttachInterfaceRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaAttachInterfaceResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaCreateKeypairRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaCreateKeypairResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaCreateServersRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaCreateServersResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaDeleteKeypairRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaDeleteKeypairResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaDeleteServerRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaDeleteServerResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaListAvailabilityZonesRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaListAvailabilityZonesResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaListKeypairsRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaListKeypairsResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaListServersDetailsRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaListServersDetailsResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaShowKeypairRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaShowKeypairResponse;
import com.ctcloud.sdk.ecs.v2.model.NovaShowServerRequest;
import com.ctcloud.sdk.ecs.v2.model.NovaShowServerResponse;
import com.ctcloud.sdk.ecs.v2.model.RegisterServerAutoRecoveryRequest;
import com.ctcloud.sdk.ecs.v2.model.RegisterServerAutoRecoveryResponse;
import com.ctcloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitRequest;
import com.ctcloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitResponse;
import com.ctcloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitRequest;
import com.ctcloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitResponse;
import com.ctcloud.sdk.ecs.v2.model.ResetServerPasswordRequest;
import com.ctcloud.sdk.ecs.v2.model.ResetServerPasswordResponse;
import com.ctcloud.sdk.ecs.v2.model.ResizePostPaidServerRequest;
import com.ctcloud.sdk.ecs.v2.model.ResizePostPaidServerResponse;
import com.ctcloud.sdk.ecs.v2.model.ResizeServerRequest;
import com.ctcloud.sdk.ecs.v2.model.ResizeServerResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowJobRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowJobResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowResetPasswordFlagRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowResetPasswordFlagResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerAutoRecoveryRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerAutoRecoveryResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerBlockDeviceRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerBlockDeviceResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerGroupRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerGroupResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerLimitsRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerLimitsResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerPasswordRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerPasswordResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerRemoteConsoleRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerRemoteConsoleResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerResponse;
import com.ctcloud.sdk.ecs.v2.model.ShowServerTagsRequest;
import com.ctcloud.sdk.ecs.v2.model.ShowServerTagsResponse;
import com.ctcloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeRequest;
import com.ctcloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeResponse;
import com.ctcloud.sdk.ecs.v2.model.UpdateServerMetadataRequest;
import com.ctcloud.sdk.ecs.v2.model.UpdateServerMetadataResponse;
import com.ctcloud.sdk.ecs.v2.model.UpdateServerRequest;
import com.ctcloud.sdk.ecs.v2.model.UpdateServerResponse;

import java.util.concurrent.CompletableFuture;

public class EcsAsyncClient {

    protected HcClient hcClient;

    public EcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsAsyncClient> newBuilder() {
        ClientBuilder<EcsAsyncClient> clientBuilder = new ClientBuilder<>(EcsAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<AddServerGroupMemberResponse> addServerGroupMemberAsync(
        AddServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.addServerGroupMember);
    }

    public AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMemberAsyncInvoker(
        AddServerGroupMemberRequest request) {
        return new AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>(request,
            EcsMeta.addServerGroupMember, hcClient);
    }

    public CompletableFuture<AssociateServerVirtualIpResponse> associateServerVirtualIpAsync(
        AssociateServerVirtualIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.associateServerVirtualIp);
    }

    public AsyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> associateServerVirtualIpAsyncInvoker(
        AssociateServerVirtualIpRequest request) {
        return new AsyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse>(request,
            EcsMeta.associateServerVirtualIp, hcClient);
    }

    public CompletableFuture<AttachServerVolumeResponse> attachServerVolumeAsync(AttachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    public AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolumeAsyncInvoker(
        AttachServerVolumeRequest request) {
        return new AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>(request,
            EcsMeta.attachServerVolume, hcClient);
    }

    public CompletableFuture<BatchAddServerNicsResponse> batchAddServerNicsAsync(BatchAddServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    public AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNicsAsyncInvoker(
        BatchAddServerNicsRequest request) {
        return new AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>(request,
            EcsMeta.batchAddServerNics, hcClient);
    }

    public CompletableFuture<BatchAttachSharableVolumesResponse> batchAttachSharableVolumesAsync(
        BatchAttachSharableVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchAttachSharableVolumes);
    }

    public AsyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> batchAttachSharableVolumesAsyncInvoker(
        BatchAttachSharableVolumesRequest request) {
        return new AsyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse>(request,
            EcsMeta.batchAttachSharableVolumes, hcClient);
    }

    public CompletableFuture<BatchCreateServerTagsResponse> batchCreateServerTagsAsync(
        BatchCreateServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    public AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTagsAsyncInvoker(
        BatchCreateServerTagsRequest request) {
        return new AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>(request,
            EcsMeta.batchCreateServerTags, hcClient);
    }

    public CompletableFuture<BatchDeleteServerNicsResponse> batchDeleteServerNicsAsync(
        BatchDeleteServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    public AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNicsAsyncInvoker(
        BatchDeleteServerNicsRequest request) {
        return new AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>(request,
            EcsMeta.batchDeleteServerNics, hcClient);
    }

    public CompletableFuture<BatchDeleteServerTagsResponse> batchDeleteServerTagsAsync(
        BatchDeleteServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    public AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTagsAsyncInvoker(
        BatchDeleteServerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>(request,
            EcsMeta.batchDeleteServerTags, hcClient);
    }

    public CompletableFuture<BatchRebootServersResponse> batchRebootServersAsync(BatchRebootServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    public AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServersAsyncInvoker(
        BatchRebootServersRequest request) {
        return new AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>(request,
            EcsMeta.batchRebootServers, hcClient);
    }

    public CompletableFuture<BatchResetServersPasswordResponse> batchResetServersPasswordAsync(
        BatchResetServersPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchResetServersPassword);
    }

    public AsyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> batchResetServersPasswordAsyncInvoker(
        BatchResetServersPasswordRequest request) {
        return new AsyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse>(request,
            EcsMeta.batchResetServersPassword, hcClient);
    }

    public CompletableFuture<BatchStartServersResponse> batchStartServersAsync(BatchStartServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    public AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse> batchStartServersAsyncInvoker(
        BatchStartServersRequest request) {
        return new AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse>(request, EcsMeta.batchStartServers,
            hcClient);
    }

    public CompletableFuture<BatchStopServersResponse> batchStopServersAsync(BatchStopServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    public AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse> batchStopServersAsyncInvoker(
        BatchStopServersRequest request) {
        return new AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse>(request, EcsMeta.batchStopServers,
            hcClient);
    }

    public CompletableFuture<BatchUpdateServersNameResponse> batchUpdateServersNameAsync(
        BatchUpdateServersNameRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchUpdateServersName);
    }

    public AsyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> batchUpdateServersNameAsyncInvoker(
        BatchUpdateServersNameRequest request) {
        return new AsyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse>(request,
            EcsMeta.batchUpdateServersName, hcClient);
    }

    public CompletableFuture<ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsync(
        ChangeServerOsWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerOsWithCloudInit);
    }

    public AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsyncInvoker(
        ChangeServerOsWithCloudInitRequest request) {
        return new AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>(request,
            EcsMeta.changeServerOsWithCloudInit, hcClient);
    }

    public CompletableFuture<ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInitAsync(
        ChangeServerOsWithoutCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerOsWithoutCloudInit);
    }

    public AsyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInitAsyncInvoker(
        ChangeServerOsWithoutCloudInitRequest request) {
        return new AsyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse>(request,
            EcsMeta.changeServerOsWithoutCloudInit, hcClient);
    }

    public CompletableFuture<CreatePostPaidServersResponse> createPostPaidServersAsync(
        CreatePostPaidServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    public AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServersAsyncInvoker(
        CreatePostPaidServersRequest request) {
        return new AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>(request,
            EcsMeta.createPostPaidServers, hcClient);
    }

    public CompletableFuture<CreateServerGroupResponse> createServerGroupAsync(CreateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServerGroup);
    }

    public AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupAsyncInvoker(
        CreateServerGroupRequest request) {
        return new AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>(request, EcsMeta.createServerGroup,
            hcClient);
    }

    public CompletableFuture<CreateServersResponse> createServersAsync(CreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServers);
    }

    public AsyncInvoker<CreateServersRequest, CreateServersResponse> createServersAsyncInvoker(
        CreateServersRequest request) {
        return new AsyncInvoker<CreateServersRequest, CreateServersResponse>(request, EcsMeta.createServers, hcClient);
    }

    public CompletableFuture<DeleteServerGroupResponse> deleteServerGroupAsync(DeleteServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroup);
    }

    public AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroupAsyncInvoker(
        DeleteServerGroupRequest request) {
        return new AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>(request, EcsMeta.deleteServerGroup,
            hcClient);
    }

    public CompletableFuture<DeleteServerGroupMemberResponse> deleteServerGroupMemberAsync(
        DeleteServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroupMember);
    }

    public AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMemberAsyncInvoker(
        DeleteServerGroupMemberRequest request) {
        return new AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>(request,
            EcsMeta.deleteServerGroupMember, hcClient);
    }

    public CompletableFuture<DeleteServerMetadataResponse> deleteServerMetadataAsync(
        DeleteServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerMetadata);
    }

    public AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadataAsyncInvoker(
        DeleteServerMetadataRequest request) {
        return new AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>(request,
            EcsMeta.deleteServerMetadata, hcClient);
    }

    public CompletableFuture<DeleteServerPasswordResponse> deleteServerPasswordAsync(
        DeleteServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerPassword);
    }

    public AsyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse> deleteServerPasswordAsyncInvoker(
        DeleteServerPasswordRequest request) {
        return new AsyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse>(request,
            EcsMeta.deleteServerPassword, hcClient);
    }

    public CompletableFuture<DeleteServersResponse> deleteServersAsync(DeleteServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServers);
    }

    public AsyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersAsyncInvoker(
        DeleteServersRequest request) {
        return new AsyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, EcsMeta.deleteServers, hcClient);
    }

    public CompletableFuture<DetachServerVolumeResponse> detachServerVolumeAsync(DetachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    public AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolumeAsyncInvoker(
        DetachServerVolumeRequest request) {
        return new AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>(request,
            EcsMeta.detachServerVolume, hcClient);
    }

    public CompletableFuture<DisassociateServerVirtualIpResponse> disassociateServerVirtualIpAsync(
        DisassociateServerVirtualIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.disassociateServerVirtualIp);
    }

    public AsyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> disassociateServerVirtualIpAsyncInvoker(
        DisassociateServerVirtualIpRequest request) {
        return new AsyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse>(request,
            EcsMeta.disassociateServerVirtualIp, hcClient);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listFlavors);
    }

    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, EcsMeta.listFlavors, hcClient);
    }

    public CompletableFuture<ListResizeFlavorsResponse> listResizeFlavorsAsync(ListResizeFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listResizeFlavors);
    }

    public AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavorsAsyncInvoker(
        ListResizeFlavorsRequest request) {
        return new AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>(request, EcsMeta.listResizeFlavors,
            hcClient);
    }

    public CompletableFuture<ListServerBlockDevicesResponse> listServerBlockDevicesAsync(
        ListServerBlockDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    public AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevicesAsyncInvoker(
        ListServerBlockDevicesRequest request) {
        return new AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>(request,
            EcsMeta.listServerBlockDevices, hcClient);
    }

    public CompletableFuture<ListServerGroupsResponse> listServerGroupsAsync(ListServerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerGroups);
    }

    public AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsAsyncInvoker(
        ListServerGroupsRequest request) {
        return new AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>(request, EcsMeta.listServerGroups,
            hcClient);
    }

    public CompletableFuture<ListServerInterfacesResponse> listServerInterfacesAsync(
        ListServerInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    public AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfacesAsyncInvoker(
        ListServerInterfacesRequest request) {
        return new AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>(request,
            EcsMeta.listServerInterfaces, hcClient);
    }

    public CompletableFuture<ListServerTagsResponse> listServerTagsAsync(ListServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerTags);
    }

    public AsyncInvoker<ListServerTagsRequest, ListServerTagsResponse> listServerTagsAsyncInvoker(
        ListServerTagsRequest request) {
        return new AsyncInvoker<ListServerTagsRequest, ListServerTagsResponse>(request, EcsMeta.listServerTags,
            hcClient);
    }

    public CompletableFuture<ListServersDetailsResponse> listServersDetailsAsync(ListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    public AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetailsAsyncInvoker(
        ListServersDetailsRequest request) {
        return new AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>(request,
            EcsMeta.listServersDetails, hcClient);
    }

    public CompletableFuture<MigrateServerResponse> migrateServerAsync(MigrateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.migrateServer);
    }

    public AsyncInvoker<MigrateServerRequest, MigrateServerResponse> migrateServerAsyncInvoker(
        MigrateServerRequest request) {
        return new AsyncInvoker<MigrateServerRequest, MigrateServerResponse>(request, EcsMeta.migrateServer, hcClient);
    }

    public CompletableFuture<NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsync(
        NovaAssociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaAssociateSecurityGroup);
    }

    public AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsyncInvoker(
        NovaAssociateSecurityGroupRequest request) {
        return new AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>(request,
            EcsMeta.novaAssociateSecurityGroup, hcClient);
    }

    public CompletableFuture<NovaAttachInterfaceResponse> novaAttachInterfaceAsync(NovaAttachInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaAttachInterface);
    }

    public AsyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> novaAttachInterfaceAsyncInvoker(
        NovaAttachInterfaceRequest request) {
        return new AsyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse>(request,
            EcsMeta.novaAttachInterface, hcClient);
    }

    public CompletableFuture<NovaCreateKeypairResponse> novaCreateKeypairAsync(NovaCreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateKeypair);
    }

    public AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypairAsyncInvoker(
        NovaCreateKeypairRequest request) {
        return new AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>(request, EcsMeta.novaCreateKeypair,
            hcClient);
    }

    public CompletableFuture<NovaCreateServersResponse> novaCreateServersAsync(NovaCreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    public AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServersAsyncInvoker(
        NovaCreateServersRequest request) {
        return new AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>(request, EcsMeta.novaCreateServers,
            hcClient);
    }

    public CompletableFuture<NovaDeleteKeypairResponse> novaDeleteKeypairAsync(NovaDeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteKeypair);
    }

    public AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypairAsyncInvoker(
        NovaDeleteKeypairRequest request) {
        return new AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>(request, EcsMeta.novaDeleteKeypair,
            hcClient);
    }

    public CompletableFuture<NovaDeleteServerResponse> novaDeleteServerAsync(NovaDeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    public AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServerAsyncInvoker(
        NovaDeleteServerRequest request) {
        return new AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>(request, EcsMeta.novaDeleteServer,
            hcClient);
    }

    public CompletableFuture<NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsync(
        NovaDisassociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDisassociateSecurityGroup);
    }

    public AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsyncInvoker(
        NovaDisassociateSecurityGroupRequest request) {
        return new AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>(request,
            EcsMeta.novaDisassociateSecurityGroup, hcClient);
    }

    public CompletableFuture<NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsync(
        NovaListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListAvailabilityZones);
    }

    public AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsyncInvoker(
        NovaListAvailabilityZonesRequest request) {
        return new AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>(request,
            EcsMeta.novaListAvailabilityZones, hcClient);
    }

    public CompletableFuture<NovaListKeypairsResponse> novaListKeypairsAsync(NovaListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListKeypairs);
    }

    public AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairsAsyncInvoker(
        NovaListKeypairsRequest request) {
        return new AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>(request, EcsMeta.novaListKeypairs,
            hcClient);
    }

    public CompletableFuture<NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsync(
        NovaListServerSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServerSecurityGroups);
    }

    public AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsyncInvoker(
        NovaListServerSecurityGroupsRequest request) {
        return new AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>(request,
            EcsMeta.novaListServerSecurityGroups, hcClient);
    }

    public CompletableFuture<NovaListServersDetailsResponse> novaListServersDetailsAsync(
        NovaListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    public AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetailsAsyncInvoker(
        NovaListServersDetailsRequest request) {
        return new AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>(request,
            EcsMeta.novaListServersDetails, hcClient);
    }

    public CompletableFuture<NovaShowKeypairResponse> novaShowKeypairAsync(NovaShowKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowKeypair);
    }

    public AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypairAsyncInvoker(
        NovaShowKeypairRequest request) {
        return new AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>(request, EcsMeta.novaShowKeypair,
            hcClient);
    }

    public CompletableFuture<NovaShowServerResponse> novaShowServerAsync(NovaShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    public AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse> novaShowServerAsyncInvoker(
        NovaShowServerRequest request) {
        return new AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse>(request, EcsMeta.novaShowServer,
            hcClient);
    }

    public CompletableFuture<RegisterServerAutoRecoveryResponse> registerServerAutoRecoveryAsync(
        RegisterServerAutoRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.registerServerAutoRecovery);
    }

    public AsyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse> registerServerAutoRecoveryAsyncInvoker(
        RegisterServerAutoRecoveryRequest request) {
        return new AsyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse>(request,
            EcsMeta.registerServerAutoRecovery, hcClient);
    }

    public CompletableFuture<ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsync(
        ReinstallServerWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.reinstallServerWithCloudInit);
    }

    public AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsyncInvoker(
        ReinstallServerWithCloudInitRequest request) {
        return new AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>(request,
            EcsMeta.reinstallServerWithCloudInit, hcClient);
    }

    public CompletableFuture<ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInitAsync(
        ReinstallServerWithoutCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.reinstallServerWithoutCloudInit);
    }

    public AsyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInitAsyncInvoker(
        ReinstallServerWithoutCloudInitRequest request) {
        return new AsyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse>(
            request, EcsMeta.reinstallServerWithoutCloudInit, hcClient);
    }

    public CompletableFuture<ResetServerPasswordResponse> resetServerPasswordAsync(ResetServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resetServerPassword);
    }

    public AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPasswordAsyncInvoker(
        ResetServerPasswordRequest request) {
        return new AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>(request,
            EcsMeta.resetServerPassword, hcClient);
    }

    public CompletableFuture<ResizePostPaidServerResponse> resizePostPaidServerAsync(
        ResizePostPaidServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    public AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServerAsyncInvoker(
        ResizePostPaidServerRequest request) {
        return new AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>(request,
            EcsMeta.resizePostPaidServer, hcClient);
    }

    public CompletableFuture<ResizeServerResponse> resizeServerAsync(ResizeServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizeServer);
    }

    public AsyncInvoker<ResizeServerRequest, ResizeServerResponse> resizeServerAsyncInvoker(
        ResizeServerRequest request) {
        return new AsyncInvoker<ResizeServerRequest, ResizeServerResponse>(request, EcsMeta.resizeServer, hcClient);
    }

    public CompletableFuture<ShowResetPasswordFlagResponse> showResetPasswordFlagAsync(
        ShowResetPasswordFlagRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showResetPasswordFlag);
    }

    public AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlagAsyncInvoker(
        ShowResetPasswordFlagRequest request) {
        return new AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>(request,
            EcsMeta.showResetPasswordFlag, hcClient);
    }

    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServer);
    }

    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<ShowServerRequest, ShowServerResponse>(request, EcsMeta.showServer, hcClient);
    }

    public CompletableFuture<ShowServerAutoRecoveryResponse> showServerAutoRecoveryAsync(
        ShowServerAutoRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerAutoRecovery);
    }

    public AsyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse> showServerAutoRecoveryAsyncInvoker(
        ShowServerAutoRecoveryRequest request) {
        return new AsyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse>(request,
            EcsMeta.showServerAutoRecovery, hcClient);
    }

    public CompletableFuture<ShowServerBlockDeviceResponse> showServerBlockDeviceAsync(
        ShowServerBlockDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerBlockDevice);
    }

    public AsyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> showServerBlockDeviceAsyncInvoker(
        ShowServerBlockDeviceRequest request) {
        return new AsyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse>(request,
            EcsMeta.showServerBlockDevice, hcClient);
    }

    public CompletableFuture<ShowServerGroupResponse> showServerGroupAsync(ShowServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerGroup);
    }

    public AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroupAsyncInvoker(
        ShowServerGroupRequest request) {
        return new AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>(request, EcsMeta.showServerGroup,
            hcClient);
    }

    public CompletableFuture<ShowServerLimitsResponse> showServerLimitsAsync(ShowServerLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerLimits);
    }

    public AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimitsAsyncInvoker(
        ShowServerLimitsRequest request) {
        return new AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>(request, EcsMeta.showServerLimits,
            hcClient);
    }

    public CompletableFuture<ShowServerPasswordResponse> showServerPasswordAsync(ShowServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerPassword);
    }

    public AsyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse> showServerPasswordAsyncInvoker(
        ShowServerPasswordRequest request) {
        return new AsyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse>(request,
            EcsMeta.showServerPassword, hcClient);
    }

    public CompletableFuture<ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsync(
        ShowServerRemoteConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerRemoteConsole);
    }

    public AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsyncInvoker(
        ShowServerRemoteConsoleRequest request) {
        return new AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>(request,
            EcsMeta.showServerRemoteConsole, hcClient);
    }

    public CompletableFuture<ShowServerTagsResponse> showServerTagsAsync(ShowServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerTags);
    }

    public AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse> showServerTagsAsyncInvoker(
        ShowServerTagsRequest request) {
        return new AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>(request, EcsMeta.showServerTags,
            hcClient);
    }

    public CompletableFuture<UpdateServerResponse> updateServerAsync(UpdateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServer);
    }

    public AsyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerAsyncInvoker(
        UpdateServerRequest request) {
        return new AsyncInvoker<UpdateServerRequest, UpdateServerResponse>(request, EcsMeta.updateServer, hcClient);
    }

    public CompletableFuture<UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeAsync(
        UpdateServerAutoTerminateTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerAutoTerminateTime);
    }

    public AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeAsyncInvoker(
        UpdateServerAutoTerminateTimeRequest request) {
        return new AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>(request,
            EcsMeta.updateServerAutoTerminateTime, hcClient);
    }

    public CompletableFuture<UpdateServerMetadataResponse> updateServerMetadataAsync(
        UpdateServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerMetadata);
    }

    public AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadataAsyncInvoker(
        UpdateServerMetadataRequest request) {
        return new AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>(request,
            EcsMeta.updateServerMetadata, hcClient);
    }

    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showJob);
    }

    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, EcsMeta.showJob, hcClient);
    }

}
