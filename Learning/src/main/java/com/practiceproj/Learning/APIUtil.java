package com.practiceproj.Learning;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;

@RestController
public class APIUtil {

    @GetMapping(value = "/test")
    public static ResponseEntity<String> callCodatAPI() throws IOException{
        String codatUrl= "https://api.codat.io/companies?page=1&pageSize=100";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic ZGRVY2F6TzVNMXUzQ2dkTUlwZ0oyRGFLQ01TYVJ4dkhiWUNjbDd0YQ==");
        HttpEntity<String> request = new HttpEntity<String>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response ;
        response = restTemplate.exchange(codatUrl , HttpMethod.GET, request,String.class);
        return response;
    }
}

//    public static ResponseEntity<String> callCodatAPI(String codatUrl) throws {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Basic ZGRVY2F6TzVNMXUzQ2dkTUlwZ0oyRGFLQ01TYVJ4dkhiWUNjbDd0YQ==");
//        HttpEntity<String> request = new HttpEntity<String>(headers);
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> response ;
//        response = restTemplate.exchange(codatUrl , HttpMethod.GET, request,String.class);
//        return response;
//    }