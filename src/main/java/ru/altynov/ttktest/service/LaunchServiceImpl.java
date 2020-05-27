package ru.altynov.ttktest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.altynov.ttktest.DTO.LaunchDTO;

import java.util.Arrays;
import java.util.List;

@Service
public class LaunchServiceImpl implements LaunchService {

    private RestTemplate restTemplate;

    @Autowired
    public LaunchServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public LaunchServiceImpl() {
    }

    @Override
    public List<LaunchDTO> getAllById(String rocketId) {
        String url = "https://api.spacexdata.com/v3/launches?rocket_id=" + rocketId;
        LaunchDTO[] result = restTemplate.getForObject(url, LaunchDTO[].class);
        return Arrays.asList(result);
    }

}
