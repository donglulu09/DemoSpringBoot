package com.efo.controller;

import com.alibaba.fastjson.JSON;
import com.efo.entity.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;


@RestController
public class TaxiController {
    @RequestMapping(value = "/slg/video/appConfig", method = RequestMethod.GET)
    public String appConfig(@RequestParam(value="apptype",required=false)  String  apptype)
    {
        String res = "";
        try
        {
            if(apptype.equals("2101"))
            {
                AppConfig appConfig = new AppConfig();
                appConfig.setTitle("chuzuche_dongyc");
                Config  config = new Config();
                double[] a1 = new double[]{22.00, 33};
                double[] a2 = new double[]{33, 44.00};
                ArrayList<double[]> temp = new ArrayList<double[]>();
                temp.add(a1);
                temp.add(a2);
                config.setLocation(temp);
                config.setMapUrl("http://192.168.0.0:8080");
                appConfig.setConfig(config);
                res  = JSON.toJSONString(appConfig);
            }
            else
            {
                res = "参数传递异常 ";
            }
        }
        catch (Exception ex)
        {
            res ="appconfig 接口异常 ";
        }
        return  res;
    }
}
