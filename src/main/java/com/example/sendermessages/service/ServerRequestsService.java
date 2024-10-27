package com.example.sendermessages.service;


import com.example.sendermessages.dto.LaunchPoolDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ServerRequestsService {
    public List<LaunchPoolDTO> returnStartSoonLaunchPools() {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<List<LaunchPoolDTO>> responseEntity = restTemplate.exchange("https://launch-pool-micro-service-d1d34cbb9309.herokuapp.com/api/get/startSoonLaunchPool",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<LaunchPoolDTO>>() {
                });
        List<LaunchPoolDTO> launchPoolDTOList = responseEntity.getBody();
        return launchPoolDTOList;
    }

    public List<LaunchPoolDTO> returnActiveLaunchPools() {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<List<LaunchPoolDTO>> responseEntity = restTemplate.exchange("https://launch-pool-micro-service-d1d34cbb9309.herokuapp.com/api/get/activeLaunchPool",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<LaunchPoolDTO>>() {
                });
        List<LaunchPoolDTO> launchPoolDTOList = responseEntity.getBody();
        return launchPoolDTOList;
    }

}
