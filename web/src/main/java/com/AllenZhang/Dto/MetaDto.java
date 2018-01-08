/*
 * Copyright (c) 2017 by AllenZhang
 */

package com.AllenZhang.Dto;

public class MetaDto {

    public String message;

    public MetaDto() {
    }

    @Override
    public String toString() {
        return "MetaDto{" + "message='" + message + '\'' + '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

