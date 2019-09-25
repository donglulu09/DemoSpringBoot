package com.efo.controller;

import com.alibaba.fastjson.JSON;
import com.efo.entity.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
                config.setLocation("[[11,22],[22,33]");
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
