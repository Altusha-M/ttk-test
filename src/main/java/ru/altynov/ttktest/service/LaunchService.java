package ru.altynov.ttktest.service;

import org.springframework.stereotype.Service;
import ru.altynov.ttktest.DTO.LaunchDTO;

import java.util.List;

@Service
public interface LaunchService {

    List<LaunchDTO> getAllById(String rocketId);

}
