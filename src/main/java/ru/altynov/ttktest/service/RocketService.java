package ru.altynov.ttktest.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RocketService {

    List<String> getAllId();

}
