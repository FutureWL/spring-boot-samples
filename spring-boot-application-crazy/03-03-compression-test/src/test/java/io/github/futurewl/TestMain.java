package io.github.futurewl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

public class TestMain {

    public static void main(String[] args) throws Exception {
        // 创建RestTemplate实例，也可以在单元测试中使用TestRestTemplate
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders requestHeaders = new HttpHeaders();
        // 设置编码为gzip
        requestHeaders.set("Accept-Encoding", "gzip");
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        // 调用hello服务
        ResponseEntity<byte[]> entity = restTemplate.exchange(
                "http://localhost:8080/hello", HttpMethod.GET, requestEntity,
                byte[].class);
        // 读取返回的内容
        GZIPInputStream inflater = new GZIPInputStream(
                new ByteArrayInputStream(entity.getBody()));
        String s = StreamUtils.copyToString(inflater, Charset.forName("UTF-8"));
        System.out.println(s);
    }
}
