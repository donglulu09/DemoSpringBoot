package com.efo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

@Data
public  class Config  implements Serializable
{
    private String mapUrl;
    private ArrayList<double[]> location;
}
