package com.sankuai.hello.controller;

import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yanhua on 2017/1/6.
 */
public class MsgControllerTest extends TestCase {

    public  void test(){
        String url = "http://localhost:8090/msg/monitor";
        JSONObject data = new JSONObject();
        data.put("message","hello");
        data.put("fromname","zhang");
        RestTemplate rest = new RestTemplate();
        Object re = rest.postForObject(url,data, Object.class);
        System.out.println(re);
    }

}