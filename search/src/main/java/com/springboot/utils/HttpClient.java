package com.springboot.utils;

import com.springboot.pojo.TestVo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.io.IOException;

@Service
public class HttpClient {
    public String client(String url, HttpMethod method, MultiValueMap<String, Object> params) throws IOException {
        Response res = new OkHttpClient().newCall(new Request.Builder().url(url).build()).execute();
        //先获得json数据格式
        String responseText = res.body().string();
        TestVo testVo = JsonUtils.objectFromJson(responseText, TestVo.class);

        return testVo.toString();
    }
}
