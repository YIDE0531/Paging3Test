package com.example.android.codelabs.paging.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/****************************************************************
 * Copyright (C) Cloud Interactive Corporation. All rights reserved.
 *
 * Author: nathan
 * Create Date: 2019/1/30
 * Usage:
 *
 * Revision History
 * Date         Author      Description
 **************************************************************/
public class BaseEntity implements Serializable{

    @SerializedName(value = "update_time")
    private String updateTime;
    @SerializedName(value = "branch_count")
    private int branchCount;
    @SerializedName(value = "serverTime")
    private String serverTime;
    @SerializedName(value = "statusCode")
    private String statusCode;
    @SerializedName(value = "statusMessage")
    private String statusMessage;
    @SerializedName(value = "statusCodeTitle")
    private String statusCodeTitle;

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public String getServerTime() {
        return serverTime;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusCodeTitle() {
        return statusCodeTitle;
    }

    public void setStatusCodeTitle(String statusCodeTitle) {
        this.statusCodeTitle = statusCodeTitle;
    }
}
