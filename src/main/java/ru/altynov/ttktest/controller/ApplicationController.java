package ru.altynov.ttktest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.altynov.ttktest.DTO.LaunchDTO;
import ru.altynov.ttktest.service.LaunchService;
import ru.altynov.ttktest.service.RocketService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    RocketService rocketService;

    LaunchService launchService;

    @Autowired
    public ApplicationController(RocketService rocketService, LaunchService launchService) {
        this.rocketService = rocketService;
        this.launchService = launchService;
    }

    @GetMapping(path = "/rocket")
    public ResponseEntity<List<String>> getRocketId() {
        return ResponseEntity.ok(rocketService.getAllId());
    }

    @GetMapping(path = "/launches/{rocket_id}")
    public ResponseEntity<List<LaunchDTO>> getLaunchesByRocketId(@PathVariable("rocket_id") String rocketId) {
        return ResponseEntity.ok(launchService.getAllById(rocketId));
    }

}
