package com.toy.restarea;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class RestAreaApiTest {

    @Autowired
    private Environment env;

    @Test
    public void RestAreaInfoApi() {
        String requestUrl = "http://data.ex.co.kr/openapi/locationinfo/locationinfoRest";
        String key = env.getProperty("key");

        if (StringUtils.isEmpty(key)) {
            return;
        }

        StringBuilder builder = new StringBuilder();
        builder.append(requestUrl)
                .append("?key=")
                .append(key)
                .append("&type=json");

        RestTemplate template = new RestTemplate();

        String response = template.getForObject(builder.toString(), String.class);
        System.out.println(response);
    }
}
