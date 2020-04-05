package com.springboot.controller;

import com.springboot.pojo.TestVo;
import com.springboot.utils.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HttpClient httpClient;

    @RequestMapping("/hellos")
    public String hello() throws IOException {
        String url = "https://in.eportalmobile.com/proxy/ampfeed/suggestions?partner=umecps&sub1=test&results-os=8&results-ps=10&ip=67.247.118.15&qt=shoe";
        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        return httpClient.client(url,  HttpMethod.POST, paramMap);

    }
}
