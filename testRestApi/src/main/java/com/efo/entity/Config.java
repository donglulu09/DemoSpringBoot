package com.efo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public  class Config  implements Serializable
{
    private String mapUrl;
    private String location;
}
