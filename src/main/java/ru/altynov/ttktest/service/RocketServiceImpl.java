package ru.altynov.ttktest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.altynov.ttktest.DTO.RocketDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import ru.altynov.ttktest.DTO.RocketDTO;

@Service
public class RocketServiceImpl implements RocketService {

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<String> getAllId() {
        String url = "https://api.spacexdata.com/v3/rockets";
        RocketDTO[] result = restTemplate.getForObject(url, RocketDTO[].class);

        return Stream.of(result)
                .map(RocketDTO::getRocketId)
                .collect(Collectors.toList());
    }

}

