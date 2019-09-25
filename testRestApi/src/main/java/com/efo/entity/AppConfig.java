package com.efo.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class AppConfig implements Serializable {
    private String title ;
    private Config config;
}

