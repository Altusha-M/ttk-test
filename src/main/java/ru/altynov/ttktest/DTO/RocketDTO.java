package ru.altynov.ttktest.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RocketDTO {

    Long id;

    @JsonProperty("rocket_id")
    String rocketId;

}