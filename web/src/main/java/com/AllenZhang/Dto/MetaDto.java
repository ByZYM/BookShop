/*
 * Copyright (c) 2017 by AllenZhang
 */

package com.AllenZhang.dto;

import com.AllenZhang.utils.Status;

public class MetaDto {

    public String message;

    public Object data;

    public Status status;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MetaDto{" + "message='" + message + '\'' + ", data=" + data + ", status=" + status + '}';
    }


    public MetaDto() {
    }

    public MetaDto(String message, Object data, Status status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

}

